package com.dev.config;

import org.hibernate.dialect.InnoDBStorageEngine;
import org.hibernate.dialect.MySQL5Dialect;
import org.hibernate.dialect.MySQLStorageEngine;
import org.hibernate.dialect.function.StandardSQLFunction;
import org.hibernate.type.StandardBasicTypes;

public class MysqlCustomDialect extends MySQL5Dialect {

  public MysqlCustomDialect() {
    super();
    registerFunction("GROUP_CONCAT",
        new StandardSQLFunction("GROUP_CONCAT", StandardBasicTypes.STRING));
  }

  @Override
  protected MySQLStorageEngine getDefaultMySQLStorageEngine() {
    return InnoDBStorageEngine.INSTANCE;
  }
}
