package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业SPU品类的通用信息
 *
 * @author auto create
 * @since 1.0, 2024-10-23 16:28:18
 */
public class EpSpuGeneralInfo extends AlipayObject {

	private static final long serialVersionUID = 5317217996295858483L;

	/**
	 * 标准一级类目代码
	 */
	@ApiField("cate_1_code_std")
	private String cate1CodeStd;

	/**
	 * 标准一级类目名称
	 */
	@ApiField("cate_1_name_std")
	private String cate1NameStd;

	/**
	 * 标准二级类目代码
	 */
	@ApiField("cate_2_code_std")
	private String cate2CodeStd;

	/**
	 * 标准二级类目名称
	 */
	@ApiField("cate_2_name_std")
	private String cate2NameStd;

	/**
	 * 置信度(商标标准）
	 */
	@ApiField("confidence")
	private String confidence;

	/**
	 * 置信度 当前字段已废弃(字段拼写错误，升级新增)
	 */
	@ApiField("confindence")
	@Deprecated
	private String confindence;

	/**
	 * 产品ID(MD5）
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 产品最新记录日期（格式：yy-MM-dd）
	 */
	@ApiField("item_mark_date")
	private String itemMarkDate;

	/**
	 * 产品名称
	 */
	@ApiField("item_name")
	private String itemName;

	public String getCate1CodeStd() {
		return this.cate1CodeStd;
	}
	public void setCate1CodeStd(String cate1CodeStd) {
		this.cate1CodeStd = cate1CodeStd;
	}

	public String getCate1NameStd() {
		return this.cate1NameStd;
	}
	public void setCate1NameStd(String cate1NameStd) {
		this.cate1NameStd = cate1NameStd;
	}

	public String getCate2CodeStd() {
		return this.cate2CodeStd;
	}
	public void setCate2CodeStd(String cate2CodeStd) {
		this.cate2CodeStd = cate2CodeStd;
	}

	public String getCate2NameStd() {
		return this.cate2NameStd;
	}
	public void setCate2NameStd(String cate2NameStd) {
		this.cate2NameStd = cate2NameStd;
	}

	public String getConfidence() {
		return this.confidence;
	}
	public void setConfidence(String confidence) {
		this.confidence = confidence;
	}

	public String getConfindence() {
		return this.confindence;
	}
	public void setConfindence(String confindence) {
		this.confindence = confindence;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemMarkDate() {
		return this.itemMarkDate;
	}
	public void setItemMarkDate(String itemMarkDate) {
		this.itemMarkDate = itemMarkDate;
	}

	public String getItemName() {
		return this.itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

}
