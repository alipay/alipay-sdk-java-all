package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-03-31 19:57:27
 */
public class SpuInfoVO extends AlipayObject {

	private static final long serialVersionUID = 6428441217294722954L;

	/**
	 * null
	 */
	@ApiListField("bind_attrs")
	@ApiField("spu_attribute_info_v_o")
	private List<SpuAttributeInfoVO> bindAttrs;

	/**
	 * 标品所属类目ID
	 */
	@ApiField("category_id")
	private String categoryId;

	/**
	 * null
	 */
	@ApiListField("key_attrs")
	@ApiField("spu_attribute_info_v_o")
	private List<SpuAttributeInfoVO> keyAttrs;

	/**
	 * null
	 */
	@ApiListField("pic_urls")
	@ApiField("string")
	private List<String> picUrls;

	/**
	 * 标品id
	 */
	@ApiField("spu_id")
	private String spuId;

	/**
	 * 标品名称
	 */
	@ApiField("spu_name")
	private String spuName;

	/**
	 * 标品状态
	 */
	@ApiField("status")
	private String status;

	public List<SpuAttributeInfoVO> getBindAttrs() {
		return this.bindAttrs;
	}
	public void setBindAttrs(List<SpuAttributeInfoVO> bindAttrs) {
		this.bindAttrs = bindAttrs;
	}

	public String getCategoryId() {
		return this.categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public List<SpuAttributeInfoVO> getKeyAttrs() {
		return this.keyAttrs;
	}
	public void setKeyAttrs(List<SpuAttributeInfoVO> keyAttrs) {
		this.keyAttrs = keyAttrs;
	}

	public List<String> getPicUrls() {
		return this.picUrls;
	}
	public void setPicUrls(List<String> picUrls) {
		this.picUrls = picUrls;
	}

	public String getSpuId() {
		return this.spuId;
	}
	public void setSpuId(String spuId) {
		this.spuId = spuId;
	}

	public String getSpuName() {
		return this.spuName;
	}
	public void setSpuName(String spuName) {
		this.spuName = spuName;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
