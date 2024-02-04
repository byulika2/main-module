package com.dev.config;

import org.hibernate.boot.model.FunctionContributions;
import org.hibernate.dialect.MySQLDialect;
import org.hibernate.type.StandardBasicTypes;

public class MysqlCustomDialect extends MySQLDialect {

    private static final String GROUP_CONCAT = "GROUP_CONCAT";
    private static final String GROUP_CONCAT_PATTERN = "GROUP_CONCAT (?1) SEPARATOR (?2)";

    @Override
    public void contributeFunctions(FunctionContributions functionContributions) {
        functionContributions.getFunctionRegistry()
                .registerPattern(GROUP_CONCAT, GROUP_CONCAT_PATTERN,
                        functionContributions.getTypeConfiguration().getBasicTypeRegistry().resolve(StandardBasicTypes.STRING));
    }
}
