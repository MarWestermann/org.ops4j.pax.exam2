/*
 * Copyright 2012 Harald Wellmann
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
package org.ops4j.pax.exam.weld;

import java.io.InputStream;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
import org.ops4j.pax.exam.ExamSystem;
import org.ops4j.pax.exam.TestAddress;
import org.ops4j.pax.exam.TestContainer;
import org.ops4j.pax.exam.TestContainerException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Harald Wellmann
 * @since 3.0.0
 */
public class WeldTestContainer implements TestContainer
{
    private static final Logger LOG = LoggerFactory.getLogger( WeldTestContainer.class );

    private Weld weld;

    private static WeldContainer weldContainer;

    public WeldTestContainer( ExamSystem system )
    {
    }

    public synchronized void call( TestAddress address )
    {
    }

    public synchronized long install( String location, InputStream stream )
    {
        return -1;
    }

    public synchronized long install( InputStream stream )
    {
        return -1;
    }

    public TestContainer start() throws TestContainerException
    {
        LOG.debug("starting Weld container");
        weld = new Weld();
        weldContainer = weld.initialize();
        return this;
    }

    public TestContainer stop()
    {
        if (weld != null) 
        {
            LOG.debug("stopping Weld container");
            weld.shutdown();
        }
        return this;
    }

    @Override
    public String toString()
    {
        return "WeldContainer";
    }

    public static WeldContainer getWeldContainer()
    {
        return weldContainer;
    }
}
