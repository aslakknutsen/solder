/*
 * JBoss, Home of Professional Open Source
 * Copyright 2011, Red Hat, Inc. and/or its affiliates, and individual
 * contributors by the @authors tag. See the copyright.txt in the
 * distribution for a full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.seam.solder.el;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.el.ELContext;
import javax.el.FunctionMapper;
import javax.el.VariableMapper;
import javax.inject.Qualifier;

/**
 * <p>
 * Qualifies the {@link FunctionMapper} and {@link VariableMapper} beans used to
 * create an {@link ELContext} for use in {@link Expressions}.
 * </p>
 * 
 * <p>
 * Seam Solder will inject a {@link FunctionMapper} and
 * {@link VariableMapper} for each instantiation of an {@link ELContext} (and
 * hence for each instantiation of {@link Expressions}); any overrides of these
 * beans should ensure that obtaining the bean instance is a lightweight
 * operation.
 * </p>
 * 
 * @author Stuart Douglas
 * @author Pete Muir
 */
@Qualifier
@Retention(RUNTIME)
@Target({ TYPE, FIELD, METHOD, PARAMETER })
public @interface Mapper
{

}
