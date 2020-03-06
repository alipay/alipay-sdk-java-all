package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 批量更新S码接口
 *
 * @author auto create
 * @since 1.0, 2020-02-26 10:37:19
 */
public class AntMerchantExpandScodeModifyModel extends AlipayObject {

	private static final long serialVersionUID = 7739937356593775148L;

	/**
	 * 批量申请修改吗接口
	 */
	@ApiListField("update_code_request")
	@ApiField("update_code_request")
	private List<UpdateCodeRequest> updateCodeRequest;

	public List<UpdateCodeRequest> getUpdateCodeRequest() {
		return this.updateCodeRequest;
	}
	public void setUpdateCodeRequest(List<UpdateCodeRequest> updateCodeRequest) {
		this.updateCodeRequest = updateCodeRequest;
	}

}
