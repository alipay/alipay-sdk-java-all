package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ka基础信息维护
 *
 * @author auto create
 * @since 1.0, 2018-06-25 14:48:00
 */
public class AlipayEcoRenthouseKaBaseinfoSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6492541596628979994L;

	/**
	 * 返回kaCode唯一标识,如果有该值则表示更新信息(新增的时候kaCode字段不是必填的,修改的时候必填)
	 */
	@ApiField("ka_code")
	private String kaCode;

	/**
	 * 公寓运营商名称-新增ka名称必填(sync的新增的时候kaName字段是必填,修改的时候不是必填)
	 */
	@ApiField("ka_name")
	private String kaName;

	public String getKaCode() {
		return this.kaCode;
	}
	public void setKaCode(String kaCode) {
		this.kaCode = kaCode;
	}

	public String getKaName() {
		return this.kaName;
	}
	public void setKaName(String kaName) {
		this.kaName = kaName;
	}

}
