package com.alipay.api.internal.util;

import com.alipay.api.AlipayConstants;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class LoadTestUtilTest {
    @Test
    public void should_return_new_map_with_load_test_flag() {
        //given
        Map<String, String> params = getParams();
        //when
        Map<String, String> result = LoadTestUtil.getParamsWithLoadTestFlag(params);
        //then
        assertThat(result.get(AlipayConstants.APP_ID), is("2016092700607517_TEST_1A"));
        assertThat(params.get(AlipayConstants.APP_ID), is("2016092700607517"));
    }

    private Map<String, String> getParams() {
        Map<String, String> input = new HashMap<String, String>();
        input.put(AlipayConstants.APP_ID, "2016092700607517");
        return input;
    }
}