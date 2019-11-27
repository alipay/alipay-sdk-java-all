package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 批量sn初始化成功校验
 *
 * @author auto create
 * @since 1.0, 2018-08-30 10:33:23
 */
public class AlipayCommerceIotMdeviceprodAssetVerifyModel extends AlipayObject {

	private static final long serialVersionUID = 1751758295235453925L;

	/**
	 * 机具编号,字符串数组
	 */
	@ApiListField("sns")
	@ApiField("string")
	private List<String> sns;

	/**
	 * 供应商id(对应机具管控平台供应商sn),全局唯一
	 */
	@ApiField("supplier_id")
	private String supplierId;

	public List<String> getSns() {
		return this.sns;
	}
	public void setSns(List<String> sns) {
		this.sns = sns;
	}

	public String getSupplierId() {
		return this.supplierId;
	}
	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}

}
