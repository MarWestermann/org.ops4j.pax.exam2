/*
 * Copyright 2009 Toni Menzel.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.ops4j.pax.exam.raw.extender.intern;

/**
 * @author Toni Menzel
 * @since Jan 10, 2010
 */
public class Probe
{

    private String m_signature;
    private String m_clazz;
    private String m_method;

    public Probe( String clazz, String method )
    {
        m_signature = clazz + "=" + method;
        m_clazz = clazz;
        m_method = method;
    }

    public String getSignature()
    {
        return m_signature;
    }
}
