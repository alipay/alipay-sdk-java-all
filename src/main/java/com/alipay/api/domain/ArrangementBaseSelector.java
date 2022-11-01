package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 合约基本信息选择器，根据产品编码，合约状态编码来过滤合约
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:38
 */
public class ArrangementBaseSelector extends AlipayObject {

	private static final long serialVersionUID = 1821317564956243131L;

	/**
	 * 合约状态列表.01 待生效，02 生效，03失效，04 取消
	 */
	@ApiListField("ar_statuses")
	@ApiField("string")
	private List<String> arStatuses;

	/**
	 * 产品外标类型:01：机构产品 02：借款人信息 03：主站产品 04： 标准机构产品  05：内部业务平台标准产品
	 */
	@ApiField("mark_type")
	private String markType;

	/**
	 * 产品编码列表
	 */
	@ApiListField("pd_codes")
	@ApiField("string")
	private List<String> pdCodes;

	/**
	 * 产品外标列表
	 */
	@ApiListField("pd_marks")
	@ApiField("string")
	private List<String> pdMarks;

	/**
	 * 是否查询出产品外标
	 */
	@ApiField("select_pd_mark")
	private Boolean selectPdMark;

	/**
	 * 是否查询出产品名称
	 */
	@ApiField("select_pd_name")
	private Boolean selectPdName;

	public List<String> getArStatuses() {
		return this.arStatuses;
	}
	public void setArStatuses(List<String> arStatuses) {
		this.arStatuses = arStatuses;
	}

	public String getMarkType() {
		return this.markType;
	}
	public void setMarkType(String markType) {
		this.markType = markType;
	}

	public List<String> getPdCodes() {
		return this.pdCodes;
	}
	public void setPdCodes(List<String> pdCodes) {
		this.pdCodes = pdCodes;
	}

	public List<String> getPdMarks() {
		return this.pdMarks;
	}
	public void setPdMarks(List<String> pdMarks) {
		this.pdMarks = pdMarks;
	}

	public Boolean getSelectPdMark() {
		return this.selectPdMark;
	}
	public void setSelectPdMark(Boolean selectPdMark) {
		this.selectPdMark = selectPdMark;
	}

	public Boolean getSelectPdName() {
		return this.selectPdName;
	}
	public void setSelectPdName(Boolean selectPdName) {
		this.selectPdName = selectPdName;
	}

}
