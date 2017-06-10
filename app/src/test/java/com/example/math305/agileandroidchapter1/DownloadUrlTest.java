package com.example.math305.agileandroidchapter1;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

/**
 * Created by math305 on 6/8/2017.
 */

@RunWith(MockitoJUnitRunner.class)
public class DownloadUrlTest {
    DownloadUrl tDownloadUrl= Mockito.mock(DownloadUrl.class);
    String htmlStr;

    @Before
    public void setUp() {
        try {
           Mockito.when(tDownloadUrl.loadFromNetwork("http://www.google.com")).thenReturn("<!doctype html><html itemscope= itemtype=http://schema.org/WebPageang=en><head>");
        } catch (IOException e) {
            // network error
        }
    }

    @Test
    public void downloadUrlTest_ReturnsTrue() {
        try{
            assertThat(tDownloadUrl.loadFromNetwork("http://www.google.com"), containsString("doctype"));
        }catch (IOException ioe){

        }

    }

}
