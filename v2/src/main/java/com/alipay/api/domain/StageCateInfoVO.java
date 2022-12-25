package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 学段类目信息
 *
 * @author auto create
 * @since 1.0, 2020-08-18 20:12:52
 */
public class StageCateInfoVO extends AlipayObject {

	private static final long serialVersionUID = 6698435253228174484L;

	/**
	 * 类目信息列表
	 */
	@ApiListField("cate_infos")
	@ApiField("cate_info_v_o")
	private List<CateInfoVO> cateInfos;

	/**
	 * 学段编码
	 */
	@ApiField("code")
	private String code;

	/**
	 * 学段名称
	 */
	@ApiField("name")
	private String name;

	public List<CateInfoVO> getCateInfos() {
		return this.cateInfos;
	}
	public void setCateInfos(List<CateInfoVO> cateInfos) {
		this.cateInfos = cateInfos;
	}

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
