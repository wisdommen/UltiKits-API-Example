package com.ultikits.plugin.ultikitsapiexample;

import com.ultikits.ultitools.abstracts.UltiToolsPlugin;

import java.io.IOException;

public class UltiToolsConnect extends UltiToolsPlugin {
    @Override
    public boolean registerSelf() throws IOException {
        return false;
    }

    @Override
    public void unregisterSelf() {

    }

    @Override
    public void reloadSelf() {
        super.reloadSelf();
    }
}
