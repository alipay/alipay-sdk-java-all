package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 查询舆情信息
 *
 * @author auto create
 * @since 1.0, 2022-04-07 17:13:23
 */
public class ZhimaCreditEpYuqingBrmQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5384611216752618457L;

	/**
	 * Unix 时间戳。查询起始时间（含 begin），精确到秒
	 */
	@ApiField("begin")
	private Long begin;

	/**
	 * 统一社会信用代码号码。当needLabelAgg为true时必填
	 */
	@ApiField("crn")
	private String crn;

	/**
	 * 文章指纹，此数值相同表示是相似文章，也可通过此字段查询相似文章
	 */
	@ApiField("doc_self_content_sign")
	private String docSelfContentSign;

	/**
	 * Unix 时间戳。查询截止时间（含 begin），精确到秒
	 */
	@ApiField("end")
	private Long end;

	/**
	 * 搜索的实体列表，全词匹配，多个关键字是与的关系
	 */
	@ApiListField("entities_and")
	@ApiField("string")
	private List<String> entitiesAnd;

	/**
	 * 搜索的实体列表，全词匹配，多个关键字是与的关系
	 */
	@ApiListField("entities_or")
	@ApiField("string")
	private List<String> entitiesOr;

	/**
	 * 新闻唯一id，多个id是或的关系
	 */
	@ApiListField("ids")
	@ApiField("string")
	private List<String> ids;

	/**
	 * 按关键字搜索，在文章标题和searchableText中搜索，多个关键字是与的关系
	 */
	@ApiListField("keywords_and")
	@ApiField("string")
	private List<String> keywordsAnd;

	/**
	 * 按关键字搜索，在文章标题和searchableText中搜索，多个关键字是或的关系
	 */
	@ApiListField("keywords_or")
	@ApiField("string")
	private List<String> keywordsOr;

	/**
	 * 标签关键字，多个标签是或的关系
	 */
	@ApiListField("labels")
	@ApiField("string")
	private List<String> labels;

	/**
	 * 是否需要对实体进行聚合
	 */
	@ApiField("need_entity_agg")
	private Boolean needEntityAgg;

	/**
	 * 是否需要对标签进行聚合
	 */
	@ApiField("need_label_agg")
	private Boolean needLabelAgg;

	/**
	 * 从第几页开始返回，默认0
	 */
	@ApiField("page")
	private String page;

	/**
	 * 单次返回的数据数量
	 */
	@ApiField("size")
	private Long size;

	/**
	 * 是否使用updateTime作为时间筛选依据。true:使用updateTime筛选，false：使用pubTime筛选
	 */
	@ApiField("use_update_time")
	private Boolean useUpdateTime;

	public Long getBegin() {
		return this.begin;
	}
	public void setBegin(Long begin) {
		this.begin = begin;
	}

	public String getCrn() {
		return this.crn;
	}
	public void setCrn(String crn) {
		this.crn = crn;
	}

	public String getDocSelfContentSign() {
		return this.docSelfContentSign;
	}
	public void setDocSelfContentSign(String docSelfContentSign) {
		this.docSelfContentSign = docSelfContentSign;
	}

	public Long getEnd() {
		return this.end;
	}
	public void setEnd(Long end) {
		this.end = end;
	}

	public List<String> getEntitiesAnd() {
		return this.entitiesAnd;
	}
	public void setEntitiesAnd(List<String> entitiesAnd) {
		this.entitiesAnd = entitiesAnd;
	}

	public List<String> getEntitiesOr() {
		return this.entitiesOr;
	}
	public void setEntitiesOr(List<String> entitiesOr) {
		this.entitiesOr = entitiesOr;
	}

	public List<String> getIds() {
		return this.ids;
	}
	public void setIds(List<String> ids) {
		this.ids = ids;
	}

	public List<String> getKeywordsAnd() {
		return this.keywordsAnd;
	}
	public void setKeywordsAnd(List<String> keywordsAnd) {
		this.keywordsAnd = keywordsAnd;
	}

	public List<String> getKeywordsOr() {
		return this.keywordsOr;
	}
	public void setKeywordsOr(List<String> keywordsOr) {
		this.keywordsOr = keywordsOr;
	}

	public List<String> getLabels() {
		return this.labels;
	}
	public void setLabels(List<String> labels) {
		this.labels = labels;
	}

	public Boolean getNeedEntityAgg() {
		return this.needEntityAgg;
	}
	public void setNeedEntityAgg(Boolean needEntityAgg) {
		this.needEntityAgg = needEntityAgg;
	}

	public Boolean getNeedLabelAgg() {
		return this.needLabelAgg;
	}
	public void setNeedLabelAgg(Boolean needLabelAgg) {
		this.needLabelAgg = needLabelAgg;
	}

	public String getPage() {
		return this.page;
	}
	public void setPage(String page) {
		this.page = page;
	}

	public Long getSize() {
		return this.size;
	}
	public void setSize(Long size) {
		this.size = size;
	}

	public Boolean getUseUpdateTime() {
		return this.useUpdateTime;
	}
	public void setUseUpdateTime(Boolean useUpdateTime) {
		this.useUpdateTime = useUpdateTime;
	}

}
