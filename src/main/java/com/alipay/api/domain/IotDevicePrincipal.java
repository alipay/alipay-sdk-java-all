package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * iot行业机具绑定关系
 *
 * @author auto create
 * @since 1.0, 2018-12-20 17:38:16
 */
public class IotDevicePrincipal extends AlipayObject {

	private static final long serialVersionUID = 6734469374385154388L;

	/**
	 * 绑定关系id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 绑定关系类型
可选项[COMMON_ISV,COMMON_MERCHANT,COMMON_SHOP,PARKING,AFFAIRS,COMMON_PRODUCT,COMMON_ASSOCIATE,COMMON_APPLICANT,ALIPAY_USERID,SEPERATE_MERCHANT]

COMMON_ISV--ISV
COMMON_MERCHANT--商户
COMMON_SHOP--门店
PARKING--停车场
AFFAIRS--政务
COMMON_PRODUCT--供应商ID
COMMON_PRODUCT_PID--供应商PID
COMMON_ASSOCIATE--合作伙伴
COMMON_APPLICANT--申请人
ALIPAY_USERID--用户
SEPERATE_MERCHANT--间联商户
	 */
	@ApiField("type")
	private String type;

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
