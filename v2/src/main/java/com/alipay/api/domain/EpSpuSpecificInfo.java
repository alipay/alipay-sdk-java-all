package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业SPU品类查询的专用信息
 *
 * @author auto create
 * @since 1.0, 2024-10-23 16:27:17
 */
public class EpSpuSpecificInfo extends AlipayObject {

	private static final long serialVersionUID = 8127419322894134292L;

	/**
	 * 1688一级类目代码
	 */
	@ApiField("cate_1_code_cbu")
	private String cate1CodeCbu;

	/**
	 * 标准一级类目代码
	 */
	@ApiField("cate_1_code_std")
	private String cate1CodeStd;

	/**
	 * 1688一级类目名称
	 */
	@ApiField("cate_1_name_cbu")
	private String cate1NameCbu;

	/**
	 * 标准一级类目名称
	 */
	@ApiField("cate_1_name_std")
	private String cate1NameStd;

	/**
	 * 1688一级类目下商品数
	 */
	@ApiField("cate_1_pro_cnt")
	private Long cate1ProCnt;

	/**
	 * 1688二级类目代码
	 */
	@ApiField("cate_2_code_cbu")
	private String cate2CodeCbu;

	/**
	 * 标准二级类目代码
	 */
	@ApiField("cate_2_code_std")
	private String cate2CodeStd;

	/**
	 * 1688二级类目名称
	 */
	@ApiField("cate_2_name_cbu")
	private String cate2NameCbu;

	/**
	 * 标准二级类目名称
	 */
	@ApiField("cate_2_name_std")
	private String cate2NameStd;

	/**
	 * 1688二级类目下商品数
	 */
	@ApiField("cate_2_pro_cnt")
	private Long cate2ProCnt;

	/**
	 * 1688三级类目代码
	 */
	@ApiField("cate_3_code_cbu")
	private String cate3CodeCbu;

	/**
	 * 1688三级类目名称
	 */
	@ApiField("cate_3_name_cbu")
	private String cate3NameCbu;

	/**
	 * 1688三级类目下商品数
	 */
	@ApiField("cate_3_pro_cnt")
	private Long cate3ProCnt;

	/**
	 * 置信度(商标标准）
	 */
	@ApiField("confidence")
	private String confidence;

	/**
	 * 置信度 当前字段已废弃(字段拼写有误，需要升级新增)
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

	public String getCate1CodeCbu() {
		return this.cate1CodeCbu;
	}
	public void setCate1CodeCbu(String cate1CodeCbu) {
		this.cate1CodeCbu = cate1CodeCbu;
	}

	public String getCate1CodeStd() {
		return this.cate1CodeStd;
	}
	public void setCate1CodeStd(String cate1CodeStd) {
		this.cate1CodeStd = cate1CodeStd;
	}

	public String getCate1NameCbu() {
		return this.cate1NameCbu;
	}
	public void setCate1NameCbu(String cate1NameCbu) {
		this.cate1NameCbu = cate1NameCbu;
	}

	public String getCate1NameStd() {
		return this.cate1NameStd;
	}
	public void setCate1NameStd(String cate1NameStd) {
		this.cate1NameStd = cate1NameStd;
	}

	public Long getCate1ProCnt() {
		return this.cate1ProCnt;
	}
	public void setCate1ProCnt(Long cate1ProCnt) {
		this.cate1ProCnt = cate1ProCnt;
	}

	public String getCate2CodeCbu() {
		return this.cate2CodeCbu;
	}
	public void setCate2CodeCbu(String cate2CodeCbu) {
		this.cate2CodeCbu = cate2CodeCbu;
	}

	public String getCate2CodeStd() {
		return this.cate2CodeStd;
	}
	public void setCate2CodeStd(String cate2CodeStd) {
		this.cate2CodeStd = cate2CodeStd;
	}

	public String getCate2NameCbu() {
		return this.cate2NameCbu;
	}
	public void setCate2NameCbu(String cate2NameCbu) {
		this.cate2NameCbu = cate2NameCbu;
	}

	public String getCate2NameStd() {
		return this.cate2NameStd;
	}
	public void setCate2NameStd(String cate2NameStd) {
		this.cate2NameStd = cate2NameStd;
	}

	public Long getCate2ProCnt() {
		return this.cate2ProCnt;
	}
	public void setCate2ProCnt(Long cate2ProCnt) {
		this.cate2ProCnt = cate2ProCnt;
	}

	public String getCate3CodeCbu() {
		return this.cate3CodeCbu;
	}
	public void setCate3CodeCbu(String cate3CodeCbu) {
		this.cate3CodeCbu = cate3CodeCbu;
	}

	public String getCate3NameCbu() {
		return this.cate3NameCbu;
	}
	public void setCate3NameCbu(String cate3NameCbu) {
		this.cate3NameCbu = cate3NameCbu;
	}

	public Long getCate3ProCnt() {
		return this.cate3ProCnt;
	}
	public void setCate3ProCnt(Long cate3ProCnt) {
		this.cate3ProCnt = cate3ProCnt;
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
