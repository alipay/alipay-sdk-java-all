package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 饿了么餐饮批量去标接口
 *
 * @author auto create
 * @since 1.0, 2020-06-15 10:49:33
 */
public class AntMerchantExpandScodeEledeUnsignModel extends AlipayObject {

	private static final long serialVersionUID = 6766654789891194627L;

	/**
	 * 去标请求
	 */
	@ApiListField("remove_tag_request")
	@ApiField("remove_tag_request")
	private List<RemoveTagRequest> removeTagRequest;

	public List<RemoveTagRequest> getRemoveTagRequest() {
		return this.removeTagRequest;
	}
	public void setRemoveTagRequest(List<RemoveTagRequest> removeTagRequest) {
		this.removeTagRequest = removeTagRequest;
	}

}
