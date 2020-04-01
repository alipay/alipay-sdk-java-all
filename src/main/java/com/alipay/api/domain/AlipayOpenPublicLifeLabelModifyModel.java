package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 标签修改接口
 *
 * @author auto create
 * @since 1.0, 2020-02-19 15:41:22
 */
public class AlipayOpenPublicLifeLabelModifyModel extends AlipayObject {

	private static final long serialVersionUID = 1474713965991621564L;

	/**
	 * 标签id，调用创建标签接口后由支付宝返回 ，只支持生活号自定义标签
	 */
	@ApiField("label_id")
	private String labelId;

	/**
	 * 标签名
	 */
	@ApiField("label_name")
	private String labelName;

	public String getLabelId() {
		return this.labelId;
	}
	public void setLabelId(String labelId) {
		this.labelId = labelId;
	}

	public String getLabelName() {
		return this.labelName;
	}
	public void setLabelName(String labelName) {
		this.labelName = labelName;
	}

}
