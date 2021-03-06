/*
 * Copyright (c) 2002-2007, Marc Prud'hommeaux. All rights reserved.
 *
 * This software is distributable under the BSD license. See the terms of the
 * BSD license in the documentation provided with this software.
 */

package jline;

import java.io.IOException;
import java.io.InputStream;

/**
 * Representation of the input terminal for a platform.
 *
 * @author <a href="mailto:mwp1@cornell.edu">Marc Prud'hommeaux</a>
 * @author <a href="mailto:jason@planet57.com">Jason Dillon</a>
 * @since 2.0
 */
public interface Terminal
{
    void init() throws Exception;

    void restore() throws Exception;

    void reset() throws Exception;

    boolean isSupported();

    int getWidth();

    int getHeight();

    boolean isAnsiSupported();

    boolean isEchoEnabled();

    void setEchoEnabled(boolean enabled);

    int readCharacter(InputStream in) throws IOException;

    int readVirtualKey(InputStream in) throws IOException;

    InputStream getDefaultBindings();
}
