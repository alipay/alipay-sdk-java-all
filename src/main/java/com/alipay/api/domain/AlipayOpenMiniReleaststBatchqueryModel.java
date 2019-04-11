package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 0411预发验证
 *
 * @author auto create
 * @since 1.0, 2019-04-11 11:04:29
 */
public class AlipayOpenMiniReleaststBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 7791158978749425966L;

	/**
	 * 20
	 */
	@ApiField("canshu")
	private String canshu;

	/**
	 * 测试数据
	 */
	@ApiField("fuza")
	private GavintestNewLeveaOne fuza;

	public String getCanshu() {
		return this.canshu;
	}
	public void setCanshu(String canshu) {
		this.canshu = canshu;
	}

	public GavintestNewLeveaOne getFuza() {
		return this.fuza;
	}
	public void setFuza(GavintestNewLeveaOne fuza) {
		this.fuza = fuza;
	}

}
