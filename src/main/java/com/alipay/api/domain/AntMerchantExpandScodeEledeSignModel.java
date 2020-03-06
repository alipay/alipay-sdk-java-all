package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 饿了么餐饮批量打标接口
 *
 * @author auto create
 * @since 1.0, 2019-11-14 17:28:45
 */
public class AntMerchantExpandScodeEledeSignModel extends AlipayObject {

	private static final long serialVersionUID = 6786275923894348829L;

	/**
	 * 打标请求参数
	 */
	@ApiListField("add_tag_request")
	@ApiField("add_tag_request")
	private List<AddTagRequest> addTagRequest;

	public List<AddTagRequest> getAddTagRequest() {
		return this.addTagRequest;
	}
	public void setAddTagRequest(List<AddTagRequest> addTagRequest) {
		this.addTagRequest = addTagRequest;
	}

}
