package com.alipay.api.internal.parser.json;

import com.alipay.api.AlipayApiException;
import com.alipay.api.SignItem;
import com.alipay.api.request.AlipayTradeCreateRequest;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class JsonConverterTest {
    private final JsonConverter converter = new JsonConverter();

    @Rule
    public final ExpectedException expectedException = ExpectedException.none();

    @Test
    public void should_extract_correct_source_data_and_sign() throws AlipayApiException {
        AlipayTradeCreateRequest request = new AlipayTradeCreateRequest();
        String responseBody = "{\"alipay_trade_create_response\":{\"code\":\"10000\",\"msg\":\"Success\","
                + "\"out_trade_no\":\"20150320010101001\",\"trade_no\":\"2019062322001446881000041395\"},"
                + "\"sign\":\"TS355N0QjK1r9GyD4YOsG5esszSUhESgwu1q5"
                + "+e1sWwqtPYe30CQ3v0QTEDdxYN9vm2No8V1KzuTSadrA4SZSkEkRchrcdVHCU8rCXOHWzS5wof8jg5S75y481kj3HqlpTaz"
                + "/EhvAXK8iC8Xz9CgPmvfLmAUNkxy0q05yV2wZAGNX0WElUOx1Lcd2FqeuRFMvBOq5TQ+SVqunfUMLic8rYsW"
                + "+smDHzIgjRcde8pHOZBMvmqDDzmyBLEgSbBswgHifQPDrhnGPlpk2U/nb8Sx7G8mWHEibtb8ClENcxtJEwcI0NN+erWO4Le"
                + "+jFVUOU0BqC4dxGBNX9AHCTZMEhfcZQ==\"}";
        SignItem signItem = converter.getSignItem(request, responseBody);
        assertThat(signItem.getSignSourceDate(), is("{\"code\":\"10000\",\"msg\":\"Success\",\"out_trade_no\":\"20150320010101001\","
                + "\"trade_no\":\"2019062322001446881000041395\"}"));
        assertThat(signItem.getSign(),
                is("TS355N0QjK1r9GyD4YOsG5esszSUhESgwu1q5"
                        + "+e1sWwqtPYe30CQ3v0QTEDdxYN9vm2No8V1KzuTSadrA4SZSkEkRchrcdVHCU8rCXOHWzS5wof8jg5S75y481kj3HqlpTaz"
                        + "/EhvAXK8iC8Xz9CgPmvfLmAUNkxy0q05yV2wZAGNX0WElUOx1Lcd2FqeuRFMvBOq5TQ+SVqunfUMLic8rYsW"
                        + "+smDHzIgjRcde8pHOZBMvmqDDzmyBLEgSbBswgHifQPDrhnGPlpk2U/nb8Sx7G8mWHEibtb8ClENcxtJEwcI0NN+erWO4Le"
                        + "+jFVUOU0BqC4dxGBNX9AHCTZMEhfcZQ=="));
    }

    @Test
    public void should_get_exception_when_has_duplication_response_node() throws AlipayApiException {
        AlipayTradeCreateRequest request = new AlipayTradeCreateRequest();
        String responseBody = "{\"alipay_trade_create_response\":{\"code\":\"10000\",\"msg\":\"Success\","
                + "\"out_trade_no\":\"20150320010101001\",\"trade_no\":\"2019062322001446881000041395\"},"
                + "\"alipay_trade_create_response\":{\"code\":\"10000\",\"msg\":\"Success\",\"out_trade_no\":\"forged\","
                + "\"trade_no\":\"forged\"},"
                + "\"sign\":\"TS355N0QjK1r9GyD4YOsG5esszSUhESgwu1q5"
                + "+e1sWwqtPYe30CQ3v0QTEDdxYN9vm2No8V1KzuTSadrA4SZSkEkRchrcdVHCU8rCXOHWzS5wof8jg5S75y481kj3HqlpTaz"
                + "/EhvAXK8iC8Xz9CgPmvfLmAUNkxy0q05yV2wZAGNX0WElUOx1Lcd2FqeuRFMvBOq5TQ+SVqunfUMLic8rYsW"
                + "+smDHzIgjRcde8pHOZBMvmqDDzmyBLEgSbBswgHifQPDrhnGPlpk2U/nb8Sx7G8mWHEibtb8ClENcxtJEwcI0NN+erWO4Le"
                + "+jFVUOU0BqC4dxGBNX9AHCTZMEhfcZQ==\"}";

        expectedException.expectMessage("检测到响应报文中有重复的alipay_trade_create_response，验签失败");
        converter.getSignItem(request, responseBody);
    }

    @Test
    public void should_not_get_exception_when_has_same_response_node_nested_in_inner_map() throws AlipayApiException {
        AlipayTradeCreateRequest request = new AlipayTradeCreateRequest();
        String responseBody = "{\"alipay_trade_create_response\":{\"code\":\"10000\",\"msg\":\"Success\","
                + "\"out_trade_no\":\"20150320010101001\",\"trade_no\":\"2019062322001446881000041395\","
                + "\"alipay_trade_create_response\":\"test\"},"
                + "\"sign\":\"TS355N0QjK1r9GyD4YOsG5esszSUhESgwu1q5"
                + "+e1sWwqtPYe30CQ3v0QTEDdxYN9vm2No8V1KzuTSadrA4SZSkEkRchrcdVHCU8rCXOHWzS5wof8jg5S75y481kj3HqlpTaz"
                + "/EhvAXK8iC8Xz9CgPmvfLmAUNkxy0q05yV2wZAGNX0WElUOx1Lcd2FqeuRFMvBOq5TQ+SVqunfUMLic8rYsW"
                + "+smDHzIgjRcde8pHOZBMvmqDDzmyBLEgSbBswgHifQPDrhnGPlpk2U/nb8Sx7G8mWHEibtb8ClENcxtJEwcI0NN+erWO4Le"
                + "+jFVUOU0BqC4dxGBNX9AHCTZMEhfcZQ==\"}";

        SignItem signItem = converter.getSignItem(request, responseBody);
        assertThat(signItem.getSignSourceDate(), is("{\"code\":\"10000\",\"msg\":\"Success\",\"out_trade_no\":\"20150320010101001\","
                + "\"trade_no\":\"2019062322001446881000041395\",\"alipay_trade_create_response\":\"test\"}"));
        assertThat(signItem.getSign(),
                is("TS355N0QjK1r9GyD4YOsG5esszSUhESgwu1q5"
                        + "+e1sWwqtPYe30CQ3v0QTEDdxYN9vm2No8V1KzuTSadrA4SZSkEkRchrcdVHCU8rCXOHWzS5wof8jg5S75y481kj3HqlpTaz"
                        + "/EhvAXK8iC8Xz9CgPmvfLmAUNkxy0q05yV2wZAGNX0WElUOx1Lcd2FqeuRFMvBOq5TQ+SVqunfUMLic8rYsW"
                        + "+smDHzIgjRcde8pHOZBMvmqDDzmyBLEgSbBswgHifQPDrhnGPlpk2U/nb8Sx7G8mWHEibtb8ClENcxtJEwcI0NN+erWO4Le"
                        + "+jFVUOU0BqC4dxGBNX9AHCTZMEhfcZQ=="));
    }
}