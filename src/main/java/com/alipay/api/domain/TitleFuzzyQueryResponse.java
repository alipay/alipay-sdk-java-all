package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 模糊查询结果
 *
 * @author auto create
 * @since 1.0, 2019-09-27 11:34:04
 */
public class TitleFuzzyQueryResponse extends AlipayObject {

	private static final long serialVersionUID = 3521717272143446963L;

	/**
	 * 企业名称列表
	 */
	@ApiListField("resp")
	@ApiField("string")
	private List<String> resp;

	public List<String> getResp() {
		return this.resp;
	}
	public void setResp(List<String> resp) {
		this.resp = resp;
	}

}
