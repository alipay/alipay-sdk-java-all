package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * ape推荐接口
 *
 * @author auto create
 * @since 1.0, 2022-11-02 16:36:15
 */
public class AlipayDigitalopUcdpApeitemQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2387481936893486295L;

	/**
	 * 推荐上下文
	 */
	@ApiField("context")
	private ApeRecContext context;

	/**
	 * 已经曝光的item列表，用于曝光去重，多个itemid用,分割，这部分item不会出现在推荐结果中。
	 */
	@ApiListField("exposed_item_list")
	@ApiField("string")
	private List<String> exposedItemList;

	/**
	 * 待推荐候选集itemId列表，用于调用方指定推荐item的范围，推荐接口将对传入的item进行打分，可为空。
	 */
	@ApiListField("item_id_list")
	@ApiField("string")
	private List<String> itemIdList;

	/**
	 * 当前页码，第一页是1
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页的大小，取值范围是1~500。分页参数为空时默认返回最多500个item。
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 商家在蚂蚁推荐引擎创建的项目id，调用前需要找蚂蚁技术获取。
	 */
	@ApiField("project_id")
	private String projectId;

	/**
	 * 可以关联到用户的标识信息，用于关联用户的特征。例如手机号、设备号、邮箱等。格式为：“类型#sha256(值）”，类型枚举有：PHONE（手机号）、DEVICE（设备号）、EMAIL（邮箱）等，具体的值是用sha256进行哈希之后的hex表示，多个标识信息用,分割。
	 */
	@ApiField("relevant_id")
	private String relevantId;

	/**
	 * 标识一次用户会话的id，用于稳定分页。如果翻页过程中，item_total_count为0，说明分页数据失效，请重新请求第一页以刷新数据。
	 */
	@ApiField("session_id")
	private String sessionId;

	/**
	 * 用户唯一标识id，可以是支付宝userid、商家自定义的userid等
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 用户id的类型，可选值：ALIPAY（支付宝userid）、CUSTOM（商家自定义的userid）
	 */
	@ApiField("user_id_type")
	private String userIdType;

	public ApeRecContext getContext() {
		return this.context;
	}
	public void setContext(ApeRecContext context) {
		this.context = context;
	}

	public List<String> getExposedItemList() {
		return this.exposedItemList;
	}
	public void setExposedItemList(List<String> exposedItemList) {
		this.exposedItemList = exposedItemList;
	}

	public List<String> getItemIdList() {
		return this.itemIdList;
	}
	public void setItemIdList(List<String> itemIdList) {
		this.itemIdList = itemIdList;
	}

	public Long getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getProjectId() {
		return this.projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getRelevantId() {
		return this.relevantId;
	}
	public void setRelevantId(String relevantId) {
		this.relevantId = relevantId;
	}

	public String getSessionId() {
		return this.sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserIdType() {
		return this.userIdType;
	}
	public void setUserIdType(String userIdType) {
		this.userIdType = userIdType;
	}

}
