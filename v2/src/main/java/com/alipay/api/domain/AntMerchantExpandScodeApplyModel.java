package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 申请支付宝S码
 *
 * @author auto create
 * @since 1.0, 2019-11-15 19:01:23
 */
public class AntMerchantExpandScodeApplyModel extends AlipayObject {

	private static final long serialVersionUID = 3173999666848271757L;

	/**
	 * apply_code_request，申请S码的请求参数
	 */
	@ApiListField("apply_code_request")
	@ApiField("apply_code_request")
	private List<ApplyCodeRequest> applyCodeRequest;

	public List<ApplyCodeRequest> getApplyCodeRequest() {
		return this.applyCodeRequest;
	}
	public void setApplyCodeRequest(List<ApplyCodeRequest> applyCodeRequest) {
		this.applyCodeRequest = applyCodeRequest;
	}

}
