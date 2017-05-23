package com.afw.yang.sql;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Created by afw on 2017/5/23.
 *
 */
@RunWith(Arquillian.class)
public class SQLConnectionTest {
    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addClass(SQLConnection.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }

}
