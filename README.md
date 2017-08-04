Added by steng@vmware.com



第一步：编辑etc/lsc.xml，主要编辑LDAP和AD的地址和用户名密码
第二步：同步OU
lsc.bat -f ../etc -s OU
第三步：同步人
cd C:\ldap2ad\lsc-2.2-SNAPSHOT\bin
lsc.bat -f ../etc -s People
第四步：同步Group
lsc.bat -f ../etc -s Group

输出的最后会有如下的显示，注意查看“errors:”，如果success>0并且errors>0，建议再执行一遍相同的命令。第二次执行会增量复制。
Aug 04 16:30:28 - INFO  - All entries: 33, to modify entries: 30, successf
odified entries: 30, errors: 0

新创建的用户，默认初始密码都是空密码，也就是没有密码，第一次登录会提示修改密码。
如果要设置初始密码，AD必须配置SSL，使用LDAPS的636端口连接AD。这是微软的限制。我们没有配置SSL的AD，也就没有做这项测试。

# LDAP Synchronization Connector

[![Build Status](https://travis-ci.org/lsc-project/lsc.svg?branch=master)](https://travis-ci.org/lsc-project/lsc)

Full HTML documentation is available at http://lsc-project.org/

## What is LSC?

Ldap Synchronization Connector reads from any data source including databases,
LDAP directories or files and transforms and compares this data to an LDAP
directory. These connectors can then be used to continuously synchronize a data
source to a directory, for a one shot import or just to compare differences by
outputting CSV or LDIF format reports.

LSC offers a powerful transformation engine, based on a scripting language, to
easily manipulate data on the fly.

Various identity management functions are included for directory-specific
compatibility - most notably Active Directory (changing passwords, account
status, last logon, etc ...). 

LSC is an open source project written in Java, available under the BSD license.

## Philosophy

Make it possible: The main goal is to provide a simple and efficient way of
synchronizing any data source to a LDAP directory quickly.

Make it stable and safe: Many companies use home-grown scripts for this kind
of synchronization. LSC is an open source tool, and all the bugs you might
write in your scripts have been fixed already (and a few more). The code is in
use worldwide and is heavily tested. Simply put, LSC is about not reinventing 
the wheel to synchronize data.

Make it faster and simpler: The added-value of LSC resides in the focus on
identity management tools - common transformations and directory-specific
behaviour come as part of the software. These functions are extensible to
include your own, to integrate into your existing infrastructure. Save time,
by reusing!

## Feature overview

* Multiple connectors: any LDAPv3 server, any database with a JDBC
  connector, flat files (or anything else you write a connector for)
* Support for LDAPv3 niceties and extensions: StartTLS, LDAPS, paged results,
  schema retrieval, LDAP Sync (rfc4533), LDAP persistent search
* Graphical setup wizard (use is optional)
* Fully configurable through plain text configuration files
* Written in Java, leveraging the ecosystem of available tools
* Simple wrapper shell scripts are provided, to ease use and system integration
* Runs on any Java-enabled platform - tested on Windows, Linux and MacOS X
* Simple attribute mapping from source to destination
* Three policies to update attributes, including forcing values, 
  non-destructive updates and merging
* Advanced attribute manipulation via a built-in Script engine (include
  support for JavaScript and Groovy scripting languages)
* Predefined libraries for use in JavaScript attribute manipulation:
    - LDAP server tools: standard bind operation can be checked on any
      LDAPv3 server
    - Active Directory tools: password update (unicodePwd attribute),
      account type and status manipulation (userAccountControl), unused
      account detection (lastLogonTimestamp)
    - String manipulation: formatting for common tasks in identity
      management, such as capitalizing first letters in a complex name,
      filtering accents for login names, etc …
    - Security tools: password hashing, bi-directional encryption
* Conditions to only create, update, rename or delete entries depending on
  current values
* Detailed and configurable logging in LDIF (fully RFC-compliant) and CSV
  formats
* Monitoring plugin for Nagios
* Possibility to extend any Java class to implement your own specific
  synchronization needs

## Read more

Find more documentation, tutorials at http://lsc-project.org/.

Join us on IRC in #lsc-project on Freenode, or on mailing lists at
http://lists.lsc-project.org.
