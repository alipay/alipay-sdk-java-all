package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 公司类型
 *
 * @author auto create
 * @since 1.0, 2021-11-12 14:33:20
 */
public class Partner extends AlipayObject {

	private static final long serialVersionUID = 6628189985398582826L;

	/**
	 * 是否用印主题
	 */
	@ApiField("need_seal_entity")
	private String needSealEntity;

	/**
	 * 公司OU
	 */
	@ApiField("ou")
	private String ou;

	/**
	 * 对方公司详细地址
	 */
	@ApiField("part_b_addr")
	private String partBAddr;

	/**
	 * 对方公司所属城市
	 */
	@ApiField("part_b_city")
	private String partBCity;

	/**
	 * 对方公司所属国家
	 */
	@ApiField("part_b_country")
	private String partBCountry;

	/**
	 * 对方公司所属省份
	 */
	@ApiField("part_b_province")
	private String partBProvince;

	/**
	 * 公司名称
	 */
	@ApiField("partner_name")
	private String partnerName;

	public String getNeedSealEntity() {
		return this.needSealEntity;
	}
	public void setNeedSealEntity(String needSealEntity) {
		this.needSealEntity = needSealEntity;
	}

	public String getOu() {
		return this.ou;
	}
	public void setOu(String ou) {
		this.ou = ou;
	}

	public String getPartBAddr() {
		return this.partBAddr;
	}
	public void setPartBAddr(String partBAddr) {
		this.partBAddr = partBAddr;
	}

	public String getPartBCity() {
		return this.partBCity;
	}
	public void setPartBCity(String partBCity) {
		this.partBCity = partBCity;
	}

	public String getPartBCountry() {
		return this.partBCountry;
	}
	public void setPartBCountry(String partBCountry) {
		this.partBCountry = partBCountry;
	}

	public String getPartBProvince() {
		return this.partBProvince;
	}
	public void setPartBProvince(String partBProvince) {
		this.partBProvince = partBProvince;
	}

	public String getPartnerName() {
		return this.partnerName;
	}
	public void setPartnerName(String partnerName) {
		this.partnerName = partnerName;
	}

}
