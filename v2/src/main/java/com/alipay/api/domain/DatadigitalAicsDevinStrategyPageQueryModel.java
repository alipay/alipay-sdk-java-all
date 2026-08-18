package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 策略列表查询
 *
 * @author auto create
 * @since 1.0, 2026-08-13 19:22:54
 */
public class DatadigitalAicsDevinStrategyPageQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5332523864552535421L;

	/**
	 * 条件连接类型枚举，可选（控制 search_fields 之间的逻辑关系）。注意：当前底层 buildQueryRequest 未消费该字段，已预留。可选值：must(且关系)、must_not(且与非关系)、should(或关系)
	 */
	@ApiField("condition_join_type_enum")
	private String conditionJoinTypeEnum;

	/**
	 * CRM线索开关枚举，可选（控制是否展示已转化线索）。注意：当前底层 buildQueryRequest 未消费该字段，已预留。可选值：OPEN(开启)、CLOSE(关闭)
	 */
	@ApiField("crm_cue_open_enum")
	private String crmCueOpenEnum;

	/**
	 * CRM查询类型枚举，可选（控制查询范围）。注意：当前底层 buildQueryRequest 未消费该字段，已预留。可选值：JOIN(我参与的)、OWNER(我负责的)、ASSIGN(分配给我的)、RELATION(我是相关人)、PUBLIC(公海的)、ALL(全部)
	 */
	@ApiField("crm_query_type_enum")
	private String crmQueryTypeEnum;

	/**
	 * 当前页码，默认1
	 */
	@ApiField("current")
	private Long current;

	/**
	 * 表单编码，固定值 WORK（底层处理器 checkRequest 校验非空，buildQueryRequest 强制使用 WORK，对客传值被忽略）
	 */
	@ApiField("form_code")
	private String formCode;

	/**
	 * null
	 */
	@ApiListField("global_search_field_list")
	@ApiField("string")
	private List<String> globalSearchFieldList;

	/**
	 * 是否只查已跟进数据，默认false
	 */
	@ApiField("has_followed")
	private Boolean hasFollowed;

	/**
	 * null
	 */
	@ApiListField("must_exist_fields")
	@ApiField("string")
	private List<String> mustExistFields;

	/**
	 * null
	 */
	@ApiListField("must_not_exist_fields")
	@ApiField("string")
	private List<String> mustNotExistFields;

	/**
	 * 是否对返回字段做脱敏，默认false
	 */
	@ApiField("need_mask_field")
	private Boolean needMaskField;

	/**
	 * 是否使用新数据格式返回，默认false
	 */
	@ApiField("new_data_format")
	private Boolean newDataFormat;

	/**
	 * null
	 */
	@ApiListField("or_not_empty_fields")
	@ApiField("string")
	private List<String> orNotEmptyFields;

	/**
	 * 归属人工号，可选（按归属人过滤）
	 */
	@ApiField("owner")
	private String owner;

	/**
	 * 每页条数，默认20，最大100
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * null
	 */
	@ApiListField("recall_field_list")
	@ApiField("string")
	private List<String> recallFieldList;

	/**
	 * 搜索字段列表（全部需匹配，AND 关系），可选。平台可映射为服务端驼峰字段
	 */
	@ApiField("search_fields")
	private SearchField searchFields;

	/**
	 * 全局搜索单词，可选
	 */
	@ApiField("search_keyword")
	private String searchKeyword;

	/**
	 * 搜索字段列表（满足其一即可，OR 关系），可选。平台可映射为服务端驼峰字段
	 */
	@ApiField("search_should_fields")
	private SearchField searchShouldFields;

	/**
	 * 排序字段列表，可选。平台可映射为服务端驼峰字段
	 */
	@ApiField("sort_fields")
	private SortField sortFields;

	/**
	 * 租户ID，长度8-32位
	 */
	@ApiField("tenant_id")
	private String tenantId;

	public String getConditionJoinTypeEnum() {
		return this.conditionJoinTypeEnum;
	}
	public void setConditionJoinTypeEnum(String conditionJoinTypeEnum) {
		this.conditionJoinTypeEnum = conditionJoinTypeEnum;
	}

	public String getCrmCueOpenEnum() {
		return this.crmCueOpenEnum;
	}
	public void setCrmCueOpenEnum(String crmCueOpenEnum) {
		this.crmCueOpenEnum = crmCueOpenEnum;
	}

	public String getCrmQueryTypeEnum() {
		return this.crmQueryTypeEnum;
	}
	public void setCrmQueryTypeEnum(String crmQueryTypeEnum) {
		this.crmQueryTypeEnum = crmQueryTypeEnum;
	}

	public Long getCurrent() {
		return this.current;
	}
	public void setCurrent(Long current) {
		this.current = current;
	}

	public String getFormCode() {
		return this.formCode;
	}
	public void setFormCode(String formCode) {
		this.formCode = formCode;
	}

	public List<String> getGlobalSearchFieldList() {
		return this.globalSearchFieldList;
	}
	public void setGlobalSearchFieldList(List<String> globalSearchFieldList) {
		this.globalSearchFieldList = globalSearchFieldList;
	}

	public Boolean getHasFollowed() {
		return this.hasFollowed;
	}
	public void setHasFollowed(Boolean hasFollowed) {
		this.hasFollowed = hasFollowed;
	}

	public List<String> getMustExistFields() {
		return this.mustExistFields;
	}
	public void setMustExistFields(List<String> mustExistFields) {
		this.mustExistFields = mustExistFields;
	}

	public List<String> getMustNotExistFields() {
		return this.mustNotExistFields;
	}
	public void setMustNotExistFields(List<String> mustNotExistFields) {
		this.mustNotExistFields = mustNotExistFields;
	}

	public Boolean getNeedMaskField() {
		return this.needMaskField;
	}
	public void setNeedMaskField(Boolean needMaskField) {
		this.needMaskField = needMaskField;
	}

	public Boolean getNewDataFormat() {
		return this.newDataFormat;
	}
	public void setNewDataFormat(Boolean newDataFormat) {
		this.newDataFormat = newDataFormat;
	}

	public List<String> getOrNotEmptyFields() {
		return this.orNotEmptyFields;
	}
	public void setOrNotEmptyFields(List<String> orNotEmptyFields) {
		this.orNotEmptyFields = orNotEmptyFields;
	}

	public String getOwner() {
		return this.owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public List<String> getRecallFieldList() {
		return this.recallFieldList;
	}
	public void setRecallFieldList(List<String> recallFieldList) {
		this.recallFieldList = recallFieldList;
	}

	public SearchField getSearchFields() {
		return this.searchFields;
	}
	public void setSearchFields(SearchField searchFields) {
		this.searchFields = searchFields;
	}

	public String getSearchKeyword() {
		return this.searchKeyword;
	}
	public void setSearchKeyword(String searchKeyword) {
		this.searchKeyword = searchKeyword;
	}

	public SearchField getSearchShouldFields() {
		return this.searchShouldFields;
	}
	public void setSearchShouldFields(SearchField searchShouldFields) {
		this.searchShouldFields = searchShouldFields;
	}

	public SortField getSortFields() {
		return this.sortFields;
	}
	public void setSortFields(SortField sortFields) {
		this.sortFields = sortFields;
	}

	public String getTenantId() {
		return this.tenantId;
	}
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

}
