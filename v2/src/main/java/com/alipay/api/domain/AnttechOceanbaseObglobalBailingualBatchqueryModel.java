package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 百灵文案批量查询接口
 *
 * @author auto create
 * @since 1.0, 2026-04-15 15:17:46
 */
public class AnttechOceanbaseObglobalBailingualBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 5394647653477148557L;

	/**
	 * 请求对象
	 */
	@ApiField("find_text_request")
	private FindTextRequest findTextRequest;

	public FindTextRequest getFindTextRequest() {
		return this.findTextRequest;
	}
	public void setFindTextRequest(FindTextRequest findTextRequest) {
		this.findTextRequest = findTextRequest;
	}

}
