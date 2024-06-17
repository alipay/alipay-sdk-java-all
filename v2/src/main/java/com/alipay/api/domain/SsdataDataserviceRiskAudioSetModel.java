package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 蚁盾音频内容识别关键词管理
 *
 * @author auto create
 * @since 1.0, 2019-07-29 16:06:21
 */
public class SsdataDataserviceRiskAudioSetModel extends AlipayObject {

	private static final long serialVersionUID = 2584717367853451586L;

	/**
	 * 关键词创建人，也即使用者
	 */
	@ApiField("creator")
	private String creator;

	/**
	 * 要删除的关键词id
	 */
	@ApiListField("id_list")
	@ApiField("string")
	private List<String> idList;

	/**
	 * 新增或查询的关键词。新增时，可以传多个用以批量新增；查询时候，可以不传或只传一个。
	 */
	@ApiListField("keyword_list")
	@ApiField("string")
	private List<String> keywordList;

	/**
	 * 修改人，一般的修改指的是删除
	 */
	@ApiField("modifier")
	private String modifier;

	/**
	 * add 表示新增；delete 表示删除；query 表示查询；
	 */
	@ApiField("operate_type")
	private String operateType;

	/**
	 * 页数
	 */
	@ApiField("page_num")
	private String pageNum;

	/**
	 * 一页展示数量
	 */
	@ApiField("page_size")
	private String pageSize;

	/**
	 * 关键词风险类型，批量增加时候，该批关键词为同一风险类型。1-涉政，2-涉黄
	 */
	@ApiField("risk_type")
	private String riskType;

	public String getCreator() {
		return this.creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}

	public List<String> getIdList() {
		return this.idList;
	}
	public void setIdList(List<String> idList) {
		this.idList = idList;
	}

	public List<String> getKeywordList() {
		return this.keywordList;
	}
	public void setKeywordList(List<String> keywordList) {
		this.keywordList = keywordList;
	}

	public String getModifier() {
		return this.modifier;
	}
	public void setModifier(String modifier) {
		this.modifier = modifier;
	}

	public String getOperateType() {
		return this.operateType;
	}
	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}

	public String getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(String pageNum) {
		this.pageNum = pageNum;
	}

	public String getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public String getRiskType() {
		return this.riskType;
	}
	public void setRiskType(String riskType) {
		this.riskType = riskType;
	}

}
