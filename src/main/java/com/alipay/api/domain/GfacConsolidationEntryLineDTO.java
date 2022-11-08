package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 多维核算并账凭证行DTO
 *
 * @author auto create
 * @since 1.0, 2022-04-21 19:39:55
 */
public class GfacConsolidationEntryLineDTO extends AlipayObject {

	private static final long serialVersionUID = 1542498944528547283L;

	/**
	 * 业务单据号组合字段，一个业务事件可能关联多业务单据信息（如应收核销应付，关联应收单与应付单），采用组合字段，包括单据类型及其主键ID
	 */
	@ApiField("biz_bill_nos_map")
	private String bizBillNosMap;

	/**
	 * 并账业务要素，扩展的多维业务要素信息（需与核算具体约定）
	 */
	@ApiField("biz_elements")
	private String bizElements;

	/**
	 * （必填）借贷方向：借D、贷C
	 */
	@ApiField("direction")
	private String direction;

	/**
	 * （必填）是否财会分录 和isMaEntry不能同时为false
	 */
	@ApiField("is_fa_entry")
	private Boolean isFaEntry;

	/**
	 * （必填）是否管会分录 和isFaEntry不能同时为false
	 */
	@ApiField("is_ma_entry")
	private Boolean isMaEntry;

	/**
	 * （必填）凭证行描述（长度限制：240个字节，中文3个字节）
	 */
	@ApiField("line_desc")
	private String lineDesc;

	/**
	 * （必填）凭证行号（幂等维度3）
	 */
	@ApiField("line_no")
	private String lineNo;

	/**
	 * 管会COA类型（管会分录行必填）
	 */
	@ApiField("ma_coa_type")
	private String maCoaType;

	/**
	 * 管会多维COA组合串，分隔符为. 管会分录必填
	 */
	@ApiField("ma_segments_str")
	private String maSegmentsStr;

	/**
	 * （必填）原币金额，单位元（注意精度，精度和币种单位有差异时会导致失败）
	 */
	@ApiField("orig_amount")
	private String origAmount;

	/**
	 * 多维COA组合串，分隔符为. （财会分录必填）
	 */
	@ApiField("segments_str")
	private String segmentsStr;

	/**
	 * 本币金额，单位元（注意精度，精度和币种单位有差异时会导致失败）（使用用户汇率及本币信息时必填）
	 */
	@ApiField("sob_amount")
	private String sobAmount;

	/**
	 * 科目编码（财会分录行必填）
	 */
	@ApiField("title_code")
	private String titleCode;

	public String getBizBillNosMap() {
		return this.bizBillNosMap;
	}
	public void setBizBillNosMap(String bizBillNosMap) {
		this.bizBillNosMap = bizBillNosMap;
	}

	public String getBizElements() {
		return this.bizElements;
	}
	public void setBizElements(String bizElements) {
		this.bizElements = bizElements;
	}

	public String getDirection() {
		return this.direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}

	public Boolean getIsFaEntry() {
		return this.isFaEntry;
	}
	public void setIsFaEntry(Boolean isFaEntry) {
		this.isFaEntry = isFaEntry;
	}

	public Boolean getIsMaEntry() {
		return this.isMaEntry;
	}
	public void setIsMaEntry(Boolean isMaEntry) {
		this.isMaEntry = isMaEntry;
	}

	public String getLineDesc() {
		return this.lineDesc;
	}
	public void setLineDesc(String lineDesc) {
		this.lineDesc = lineDesc;
	}

	public String getLineNo() {
		return this.lineNo;
	}
	public void setLineNo(String lineNo) {
		this.lineNo = lineNo;
	}

	public String getMaCoaType() {
		return this.maCoaType;
	}
	public void setMaCoaType(String maCoaType) {
		this.maCoaType = maCoaType;
	}

	public String getMaSegmentsStr() {
		return this.maSegmentsStr;
	}
	public void setMaSegmentsStr(String maSegmentsStr) {
		this.maSegmentsStr = maSegmentsStr;
	}

	public String getOrigAmount() {
		return this.origAmount;
	}
	public void setOrigAmount(String origAmount) {
		this.origAmount = origAmount;
	}

	public String getSegmentsStr() {
		return this.segmentsStr;
	}
	public void setSegmentsStr(String segmentsStr) {
		this.segmentsStr = segmentsStr;
	}

	public String getSobAmount() {
		return this.sobAmount;
	}
	public void setSobAmount(String sobAmount) {
		this.sobAmount = sobAmount;
	}

	public String getTitleCode() {
		return this.titleCode;
	}
	public void setTitleCode(String titleCode) {
		this.titleCode = titleCode;
	}

}
