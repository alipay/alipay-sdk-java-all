package com.alipay.api.internal.util;

import com.alibaba.fastjson.JSON;
import com.alipay.api.internal.util.fixture.RandomResponse;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class AlipaySignatureTest {
    @Test
    public void should_extract_correct_sign_content_when_response_is_normal_json() {
        String response = "{\"alipay_trade_create_response\":{\"code\":\"10000\",\"msg\":\"Success\","
                + "\"out_trade_no\":\"20150320010101001\",\"trade_no\":\"2019062322001446881000041395\"},"
                + "\"sign\":\"TS355N0QjK1r9GyD4YOsG5esszSUhESgwu1q5"
                + "+e1sWwqtPYe30CQ3v0QTEDdxYN9vm2No8V1KzuTSadrA4SZSkEkRchrcdVHCU8rCXOHWzS5wof8jg5S75y481kj3HqlpTaz"
                + "/EhvAXK8iC8Xz9CgPmvfLmAUNkxy0q05yV2wZAGNX0WElUOx1Lcd2FqeuRFMvBOq5TQ+SVqunfUMLic8rYsW"
                + "+smDHzIgjRcde8pHOZBMvmqDDzmyBLEgSbBswgHifQPDrhnGPlpk2U/nb8Sx7G8mWHEibtb8ClENcxtJEwcI0NN+erWO4Le"
                + "+jFVUOU0BqC4dxGBNX9AHCTZMEhfcZQ==\"}";

        SignSourceData signSourceData = AlipaySignature.extractSignContent(response, 32);

        assertThat(signSourceData.getSourceData(), is("{\"code\":\"10000\",\"msg\":\"Success\","
                + "\"out_trade_no\":\"20150320010101001\",\"trade_no\":\"2019062322001446881000041395\"}"));
    }

    @Test
    public void should_extract_correct_sign_content_when_response_has_nested_object() {
        String response = "{\"alipay_trade_create_response\":{\"code\":\"10000\",\"msg\":\"Success\",\"nested\":{\"a\":1,\"b\":\"2\"},"
                + "\"out_trade_no\":\"20150320010101001\",\"trade_no\":\"2019062322001446881000041395\"},"
                + "\"sign\":\"TS355N0QjK1r9GyD4YOsG5esszSUhESgwu1q5"
                + "+e1sWwqtPYe30CQ3v0QTEDdxYN9vm2No8V1KzuTSadrA4SZSkEkRchrcdVHCU8rCXOHWzS5wof8jg5S75y481kj3HqlpTaz"
                + "/EhvAXK8iC8Xz9CgPmvfLmAUNkxy0q05yV2wZAGNX0WElUOx1Lcd2FqeuRFMvBOq5TQ+SVqunfUMLic8rYsW"
                + "+smDHzIgjRcde8pHOZBMvmqDDzmyBLEgSbBswgHifQPDrhnGPlpk2U/nb8Sx7G8mWHEibtb8ClENcxtJEwcI0NN+erWO4Le"
                + "+jFVUOU0BqC4dxGBNX9AHCTZMEhfcZQ==\"}";

        SignSourceData signSourceData = AlipaySignature.extractSignContent(response, 32);

        assertThat(signSourceData.getSourceData(), is("{\"code\":\"10000\",\"msg\":\"Success\",\"nested\":{\"a\":1,\"b\":\"2\"},"
                + "\"out_trade_no\":\"20150320010101001\",\"trade_no\":\"2019062322001446881000041395\"}"));
    }

    @Test
    public void should_extract_correct_sign_content_when_response_has_nested_array() {
        String response = "{\"alipay_trade_create_response\":{\"code\":\"10000\",\"msg\":\"Success\",\"nested\":{\"a\":1,\"b\":\"2\","
                + "\"array\":[\"1\",\"2\",\"3\"]},\"out_trade_no\":\"20150320010101001\",\"trade_no\":\"2019062322001446881000041395\"},"
                + "\"sign\":\"TS355N0QjK1r9GyD4YOsG5esszSUhESgwu1q5"
                + "+e1sWwqtPYe30CQ3v0QTEDdxYN9vm2No8V1KzuTSadrA4SZSkEkRchrcdVHCU8rCXOHWzS5wof8jg5S75y481kj3HqlpTaz"
                + "/EhvAXK8iC8Xz9CgPmvfLmAUNkxy0q05yV2wZAGNX0WElUOx1Lcd2FqeuRFMvBOq5TQ+SVqunfUMLic8rYsW"
                + "+smDHzIgjRcde8pHOZBMvmqDDzmyBLEgSbBswgHifQPDrhnGPlpk2U/nb8Sx7G8mWHEibtb8ClENcxtJEwcI0NN+erWO4Le"
                + "+jFVUOU0BqC4dxGBNX9AHCTZMEhfcZQ==\"}";

        SignSourceData signSourceData = AlipaySignature.extractSignContent(response, 32);

        assertThat(signSourceData.getSourceData(), is("{\"code\":\"10000\",\"msg\":\"Success\",\"nested\":{\"a\":1,\"b\":\"2\","
                + "\"array\":[\"1\",\"2\",\"3\"]},\"out_trade_no\":\"20150320010101001\",\"trade_no\":\"2019062322001446881000041395\"}"));
    }

    @Test
    public void should_extract_correct_sign_content_when_response_has_paired_braces_in_json_value() {
        String response = "{\"alipay_trade_create_response\":{\"code\":\"10000\",\"msg\":\"Success\",\"nested\":{\"a\":1,\"b\":\"2\","
                + "\"array\":[\"1\",\"2\",\"3\"]},\"out_trade_no\":\"201{5}0320010101001{}\","
                + "\"trade_no\":\"2019062322001446881000041395\"},"
                + "\"sign\":\"TS355N0QjK1r9GyD4YOsG5esszSUhESgwu1q5"
                + "+e1sWwqtPYe30CQ3v0QTEDdxYN9vm2No8V1KzuTSadrA4SZSkEkRchrcdVHCU8rCXOHWzS5wof8jg5S75y481kj3HqlpTaz"
                + "/EhvAXK8iC8Xz9CgPmvfLmAUNkxy0q05yV2wZAGNX0WElUOx1Lcd2FqeuRFMvBOq5TQ+SVqunfUMLic8rYsW"
                + "+smDHzIgjRcde8pHOZBMvmqDDzmyBLEgSbBswgHifQPDrhnGPlpk2U/nb8Sx7G8mWHEibtb8ClENcxtJEwcI0NN+erWO4Le"
                + "+jFVUOU0BqC4dxGBNX9AHCTZMEhfcZQ==\"}";

        SignSourceData signSourceData = AlipaySignature.extractSignContent(response, 32);

        assertThat(signSourceData.getSourceData(), is("{\"code\":\"10000\",\"msg\":\"Success\",\"nested\":{\"a\":1,\"b\":\"2\","
                + "\"array\":[\"1\",\"2\",\"3\"]},\"out_trade_no\":\"201{5}0320010101001{}\","
                + "\"trade_no\":\"2019062322001446881000041395\"}"));
    }

    @Test
    public void should_extract_correct_sign_content_when_response_has_paired_braces_in_json_key() {
        String response = "{\"alipay_trade_create_response\":{\"code\":\"10000\",\"msg\":\"Success\",\"nested\":{\"a\":1,\"b\":\"2\","
                + "\"array\":[\"1\",\"2\",\"3\"]},\"out_{trade}_{no}\":\"201{5}0320010101001{}\","
                + "\"trade_no\":\"2019062322001446881000041395\"},"
                + "\"sign\":\"TS355N0QjK1r9GyD4YOsG5esszSUhESgwu1q5"
                + "+e1sWwqtPYe30CQ3v0QTEDdxYN9vm2No8V1KzuTSadrA4SZSkEkRchrcdVHCU8rCXOHWzS5wof8jg5S75y481kj3HqlpTaz"
                + "/EhvAXK8iC8Xz9CgPmvfLmAUNkxy0q05yV2wZAGNX0WElUOx1Lcd2FqeuRFMvBOq5TQ+SVqunfUMLic8rYsW"
                + "+smDHzIgjRcde8pHOZBMvmqDDzmyBLEgSbBswgHifQPDrhnGPlpk2U/nb8Sx7G8mWHEibtb8ClENcxtJEwcI0NN+erWO4Le"
                + "+jFVUOU0BqC4dxGBNX9AHCTZMEhfcZQ==\"}";

        SignSourceData signSourceData = AlipaySignature.extractSignContent(response, 32);

        assertThat(signSourceData.getSourceData(), is("{\"code\":\"10000\",\"msg\":\"Success\",\"nested\":{\"a\":1,\"b\":\"2\","
                + "\"array\":[\"1\",\"2\",\"3\"]},\"out_{trade}_{no}\":\"201{5}0320010101001{}\","
                + "\"trade_no\":\"2019062322001446881000041395\"}"));
    }

    @Test
    public void should_extract_correct_sign_content_when_response_has_not_paired_brace_in_json_value() {
        String response = "{\"alipay_trade_create_response\":{\"code\":\"100}00\",\"msg\":\"Suc}cess\",\"nested\":{\"a\":1,\"b\":\"2\","
                + "\"array\":[\"{1\",\"2\",\"3\"]},\"out_{trade}_{no}\":\"201{5}0320010101001{}\","
                + "\"trade_no\":\"2019062{322001446881000041395\"},"
                + "\"sign\":\"TS355N0QjK1r9GyD4YOsG5esszSUhESgwu1q5"
                + "+e1sWwqtPYe30CQ3v0QTEDdxYN9vm2No8V1KzuTSadrA4SZSkEkRchrcdVHCU8rCXOHWzS5wof8jg5S75y481kj3HqlpTaz"
                + "/EhvAXK8iC8Xz9CgPmvfLmAUNkxy0q05yV2wZAGNX0WElUOx1Lcd2FqeuRFMvBOq5TQ+SVqunfUMLic8rYsW"
                + "+smDHzIgjRcde8pHOZBMvmqDDzmyBLEgSbBswgHifQPDrhnGPlpk2U/nb8Sx7G8mWHEibtb8ClENcxtJEwcI0NN+erWO4Le"
                + "+jFVUOU0BqC4dxGBNX9AHCTZMEhfcZQ==\"}";

        SignSourceData signSourceData = AlipaySignature.extractSignContent(response, 32);

        assertThat(signSourceData.getSourceData(), is("{\"code\":\"100}00\",\"msg\":\"Suc}cess\",\"nested\":{\"a\":1,\"b\":\"2\","
                + "\"array\":[\"{1\",\"2\",\"3\"]},\"out_{trade}_{no}\":\"201{5}0320010101001{}\","
                + "\"trade_no\":\"2019062{322001446881000041395\"}"));
    }

    @Test
    public void should_extract_correct_sign_content_when_response_has_not_paired_brace_in_json_key() {
        String response = "{\"alipay_trade_create_response\":{\"co{de\":\"100}00\",\"ms}g\":\"Suc}cess\",\"ne{sted\":{\"a\":1,"
                + "\"b\":\"2\",\"array\":[\"{1\",\"2\",\"3\"]},\"{out_{trade}_{no}\":\"201{5}0320010101001{}\","
                + "\"trade_no}\":\"2019062{322001446881000041395\"},"
                + "\"sign\":\"TS355N0QjK1r9GyD4YOsG5esszSUhESgwu1q5"
                + "+e1sWwqtPYe30CQ3v0QTEDdxYN9vm2No8V1KzuTSadrA4SZSkEkRchrcdVHCU8rCXOHWzS5wof8jg5S75y481kj3HqlpTaz"
                + "/EhvAXK8iC8Xz9CgPmvfLmAUNkxy0q05yV2wZAGNX0WElUOx1Lcd2FqeuRFMvBOq5TQ+SVqunfUMLic8rYsW"
                + "+smDHzIgjRcde8pHOZBMvmqDDzmyBLEgSbBswgHifQPDrhnGPlpk2U/nb8Sx7G8mWHEibtb8ClENcxtJEwcI0NN+erWO4Le"
                + "+jFVUOU0BqC4dxGBNX9AHCTZMEhfcZQ==\"}";

        SignSourceData signSourceData = AlipaySignature.extractSignContent(response, 32);

        assertThat(signSourceData.getSourceData(), is("{\"co{de\":\"100}00\",\"ms}g\":\"Suc}cess\",\"ne{sted\":{\"a\":1,"
                + "\"b\":\"2\",\"array\":[\"{1\",\"2\",\"3\"]},\"{out_{trade}_{no}\":\"201{5}0320010101001{}\","
                + "\"trade_no}\":\"2019062{322001446881000041395\"}"));
    }

    @Test
    public void should_extract_correct_sign_content_when_response_has_not_paired_brace_and_quotation_in_json_value() {
        String response = "{\"alipay_trade_create_response\":{\"co{de\":\"100}00\",\"ms}g\":\"Suc\\\"}cess\",\"ne{sted\":{\"a\":1,"
                + "\"b\":\"2\",\"array\":[\"\\\"{1\",\"2\",\"3\"]},\"{out_{trade}_{no}\":\"201{5\\\"}0320010101001{}\","
                + "\"trade_no}\":\"20\\\"19062{322001446881000041395\"},"
                + "\"sign\":\"TS355N0QjK1r9GyD4YOsG5esszSUhESgwu1q5"
                + "+e1sWwqtPYe30CQ3v0QTEDdxYN9vm2No8V1KzuTSadrA4SZSkEkRchrcdVHCU8rCXOHWzS5wof8jg5S75y481kj3HqlpTaz"
                + "/EhvAXK8iC8Xz9CgPmvfLmAUNkxy0q05yV2wZAGNX0WElUOx1Lcd2FqeuRFMvBOq5TQ+SVqunfUMLic8rYsW"
                + "+smDHzIgjRcde8pHOZBMvmqDDzmyBLEgSbBswgHifQPDrhnGPlpk2U/nb8Sx7G8mWHEibtb8ClENcxtJEwcI0NN+erWO4Le"
                + "+jFVUOU0BqC4dxGBNX9AHCTZMEhfcZQ==\"}";

        SignSourceData signSourceData = AlipaySignature.extractSignContent(response, 32);

        assertThat(signSourceData.getSourceData(), is("{\"co{de\":\"100}00\",\"ms}g\":\"Suc\\\"}cess\",\"ne{sted\":{\"a\":1,"
                + "\"b\":\"2\",\"array\":[\"\\\"{1\",\"2\",\"3\"]},\"{out_{trade}_{no}\":\"201{5\\\"}0320010101001{}\","
                + "\"trade_no}\":\"20\\\"19062{322001446881000041395\"}"));
    }

    @Test
    public void
    should_extract_correct_sign_content_when_response_has_even_consecutive_escape_count_before_quotation_in_json_key_and_value() {
        String response = "{\"alipay_trade_create_response\":{\"code\":\"10000\\\\\",         \"msg\": \"Success\",         "
                + "\"\\\\out_trade_no\\\\\": \"\\\\\\\\20150320010101001\\\\\\\\\",         \"trade_no\": "
                + "\"2019062322001446881000041395\"     },     \"sign\": "
                + "\"TS355N0QjK1r9GyD4YOsG5esszSUhESgwu1q5"
                + "+e1sWwqtPYe30CQ3v0QTEDdxYN9vm2No8V1KzuTSadrA4SZSkEkRchrcdVHCU8rCXOHWzS5wof8jg5S75y481kj3HqlpTaz"
                + "/EhvAXK8iC8Xz9CgPmvfLmAUNkxy0q05yV2wZAGNX0WElUOx1Lcd2FqeuRFMvBOq5TQ+SVqunfUMLic8rYsW"
                + "+smDHzIgjRcde8pHOZBMvmqDDzmyBLEgSbBswgHifQPDrhnGPlpk2U/nb8Sx7G8mWHEibtb8ClENcxtJEwcI0NN+erWO4Le"
                + "+jFVUOU0BqC4dxGBNX9AHCTZMEhfcZQ==\" }";

        SignSourceData signSourceData = AlipaySignature.extractSignContent(response, 32);

        assertThat(signSourceData.getSourceData(),
                is("{\"code\":\"10000\\\\\",         \"msg\": \"Success\",         \"\\\\out_trade_no\\\\\": "
                        + "\"\\\\\\\\20150320010101001\\\\\\\\\",         \"trade_no\": \"2019062322001446881000041395\"     }"));
    }

    @Test
    public void should_extract_correct_sign_content_when_response_encrypted() {
        String response = "{\"alipay_trade_create_response"
                + "\":\"eyJjb2RlIjoiMTAwMDAiLCJtc2ciOiJTdWNjZXNzIiwib3V0X3RyYWRlX25vIjoiMjAxNTAzMjAwMTAxMDEwMDEiLCJ0"
                + "cmFkZV9ubyI6IjIwMTkwNjIzMjIwMDE0NDY4ODEwMDAwNDEzOTUifQ==\","
                + "\"sign\":\"TS355N0QjK1r9GyD4YOsG5esszSUhESgwu1q5"
                + "+e1sWwqtPYe30CQ3v0QTEDdxYN9vm2No8V1KzuTSadrA4SZSkEkRchrcdVHCU8rCXOHWzS5wof8jg5S75y481kj3HqlpTaz"
                + "/EhvAXK8iC8Xz9CgPmvfLmAUNkxy0q05yV2wZAGNX0WElUOx1Lcd2FqeuRFMvBOq5TQ+SVqunfUMLic8rYsW"
                + "+smDHzIgjRcde8pHOZBMvmqDDzmyBLEgSbBswgHifQPDrhnGPlpk2U/nb8Sx7G8mWHEibtb8ClENcxtJEwcI0NN+erWO4Le"
                + "+jFVUOU0BqC4dxGBNX9AHCTZMEhfcZQ==\"}";

        SignSourceData signSourceData = AlipaySignature.extractSignContent(response, 32);

        assertThat(signSourceData.getSourceData(), is("\"eyJjb2RlIjoiMTAwMDAiLCJtc2ciOiJTdWNjZXNzIiwib3V0X3RyYWRlX25vIjoiMjAxNTAzMjAwMTAxMD"
                + "EwMDEiLCJ0cmFkZV9ubyI6IjIwMTkwNjIzMjIwMDE0NDY4ODEwMDAwNDEzOTUifQ==\""));
    }

    @Test
    public void should_extract_correct_sign_content_when_response_encrypted_and_with_blank_space() {
        String response = "{\"alipay_trade_create_response"
                + "\"      :      \"eyJjb2RlIjoiMTAwMDAiLCJtc2ciOiJTdWNjZXNzIiwib3V0X3RyYWRlX25vIjoiMjAxNTAzMjAwMTAxMDEwMDEiLCJ0"
                + "cmFkZV9ubyI6IjIwMTkwNjIzMjIwMDE0NDY4ODEwMDAwNDEzOTUifQ==\","
                + "\"sign\":\"TS355N0QjK1r9GyD4YOsG5esszSUhESgwu1q5"
                + "+e1sWwqtPYe30CQ3v0QTEDdxYN9vm2No8V1KzuTSadrA4SZSkEkRchrcdVHCU8rCXOHWzS5wof8jg5S75y481kj3HqlpTaz"
                + "/EhvAXK8iC8Xz9CgPmvfLmAUNkxy0q05yV2wZAGNX0WElUOx1Lcd2FqeuRFMvBOq5TQ+SVqunfUMLic8rYsW"
                + "+smDHzIgjRcde8pHOZBMvmqDDzmyBLEgSbBswgHifQPDrhnGPlpk2U/nb8Sx7G8mWHEibtb8ClENcxtJEwcI0NN+erWO4Le"
                + "+jFVUOU0BqC4dxGBNX9AHCTZMEhfcZQ==\"}";

        SignSourceData signSourceData = AlipaySignature.extractSignContent(response, 32);

        assertThat(signSourceData.getSourceData(), is("\"eyJjb2RlIjoiMTAwMDAiLCJtc2ciOiJTdWNjZXNzIiwib3V0X3RyYWRlX25vIjoiMjAxNTAzMjAwMTAxMD"
                + "EwMDEiLCJ0cmFkZV9ubyI6IjIwMTkwNjIzMjIwMDE0NDY4ODEwMDAwNDEzOTUifQ==\""));
    }

    @Test
    public void should_pass_random_input_test() {
        for (int caseId = 0; caseId != 100; ++caseId) {
            System.out.println("Case:" + caseId);

            RandomResponse object = new RandomResponse();
            String response = JSON.toJSONString(object);
            SignSourceData signSourceData = AlipaySignature.extractSignContent(response, 32);

            if (!signSourceData.getSourceData().equals(JSON.toJSONString(object.getResponse()))) {
                System.out.println(response);
                throw new RuntimeException(caseId + "号测试不通过。");
            }
        }
    }
}