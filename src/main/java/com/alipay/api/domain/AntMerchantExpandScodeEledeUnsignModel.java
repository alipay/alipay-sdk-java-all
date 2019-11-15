package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 饿了么餐饮批量去标接口
 *
 * @author auto create
 * @since 1.0, 2019-11-14 17:28:30
 */
public class AntMerchantExpandScodeEledeUnsignModel extends AlipayObject {

	private static final long serialVersionUID = 4123646328451142174L;

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
