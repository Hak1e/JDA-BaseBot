package com.bot.modules.commands;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
//@Target(ElementType.METHOD)
public @interface Command {
    String name();
    String description();
}
