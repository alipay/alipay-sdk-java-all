package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.data.wenlei.test.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipaySecurityDataWenleiTestQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6625941955748924723L;

	/** 
	 * 参数描述必须通俗易懂、无错别字、完整。描述的内容请按此格式填写：参数名+是否test唯一(如需)+应用场景+枚举值(如有)+如何获取+特殊说明(如有)。如不符合标准终审会驳回，影响上线时间。
	 */
	@ApiListField("test2")
	@ApiField("string")
	private List<String> test2;

	/** 
	 * hello10
	 */
	@ApiField("testoutput")
	private String testoutput;

	public void setTest2(List<String> test2) {
		this.test2 = test2;
	}
	public List<String> getTest2( ) {
		return this.test2;
	}

	public void setTestoutput(String testoutput) {
		this.testoutput = testoutput;
	}
	public String getTestoutput( ) {
		return this.testoutput;
	}

}
