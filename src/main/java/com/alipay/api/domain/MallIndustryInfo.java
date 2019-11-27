package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商圈的行业维表信息息
 *
 * @author auto create
 * @since 1.0, 2016-09-01 13:14:46
 */
public class MallIndustryInfo extends AlipayObject {

	private static final long serialVersionUID = 8727498852543214488L;

	/**
	 * 行业一级类目
	 */
	@ApiField("cate_1_id")
	private String cate1Id;

	/**
	 * 行业一级类目名称
	 */
	@ApiField("cate_1_name")
	private String cate1Name;

	/**
	 * 行业二级类目
	 */
	@ApiField("cate_2_id")
	private String cate2Id;

	/**
	 * 行业二级类目名称
	 */
	@ApiField("cate_2_name")
	private String cate2Name;

	/**
	 * 行业三级类目
	 */
	@ApiField("cate_3_id")
	private String cate3Id;

	/**
	 * 行业三级类目名称
	 */
	@ApiField("cate_3_name")
	private String cate3Name;

	public String getCate1Id() {
		return this.cate1Id;
	}
	public void setCate1Id(String cate1Id) {
		this.cate1Id = cate1Id;
	}

	public String getCate1Name() {
		return this.cate1Name;
	}
	public void setCate1Name(String cate1Name) {
		this.cate1Name = cate1Name;
	}

	public String getCate2Id() {
		return this.cate2Id;
	}
	public void setCate2Id(String cate2Id) {
		this.cate2Id = cate2Id;
	}

	public String getCate2Name() {
		return this.cate2Name;
	}
	public void setCate2Name(String cate2Name) {
		this.cate2Name = cate2Name;
	}

	public String getCate3Id() {
		return this.cate3Id;
	}
	public void setCate3Id(String cate3Id) {
		this.cate3Id = cate3Id;
	}

	public String getCate3Name() {
		return this.cate3Name;
	}
	public void setCate3Name(String cate3Name) {
		this.cate3Name = cate3Name;
	}

}
