package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 消费明细查询接口
 *
 * @author auto create
 * @since 1.0, 2025-01-07 11:36:55
 */
public class AlipayDataDataserviceAdConsumehistoryQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7314154359536679433L;

	/**
	 * 登录用户支付宝统一ID,2088开头字符串。登录校验和可反查出user_id。 【alipay_pid和principal_tag使用方法： 只传alipay_pid：获取的代理商下所有商家或直客的数据合计。 alipay_pid和principal_tag都传：若为代理商会获取代理商下指定委托人数据。若是直客会获取自身的合计数据。】
	 */
	@ApiField("alipay_pid")
	private String alipayPid;

	/**
	 * 场景编码目前固定：
SEARCH-搜索
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 权限token,唯一值,在广告投放平台商家详情获取。
	 */
	@ApiField("biz_token")
	private String bizToken;

	/**
	 * 分页查询的页码从1开始
	 */
	@ApiField("current")
	private Long current;

	/**
	 * 数据查询结束时间，时间格式：yyyy-MM-dd，时间左闭右闭，结束时间不能大于当天
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * 聚合条件数据维度：
DATE-天；
MONTH-月
	 */
	@ApiField("group_condition")
	private String groupCondition;

	/**
	 * 每页条数，最大100，明细时按日期倒序，为空时默认=100，单位：条
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 商家标志,唯一值,在广告投放平台商家详情获取。
	 */
	@ApiField("principal_tag")
	private String principalTag;

	/**
	 * 全域智投-INTELLIGENT
搜索推广-SEARCH
品牌整合营销-BRAND
展示推广-APP
户外推广-OOH
	 */
	@ApiField("scene_type")
	private String sceneType;

	/**
	 * 消耗类型数据维度：
"RTB"-竞价交易
"GD"-合约交易
	 */
	@ApiField("sell_mode")
	private String sellMode;

	/**
	 * 数据查询开始时间，时间格式：yyyy-MM-dd，开始时间不能大于结束时间
	 */
	@ApiField("start_date")
	private String startDate;

	public String getAlipayPid() {
		return this.alipayPid;
	}
	public void setAlipayPid(String alipayPid) {
		this.alipayPid = alipayPid;
	}

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getBizToken() {
		return this.bizToken;
	}
	public void setBizToken(String bizToken) {
		this.bizToken = bizToken;
	}

	public Long getCurrent() {
		return this.current;
	}
	public void setCurrent(Long current) {
		this.current = current;
	}

	public String getEndDate() {
		return this.endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getGroupCondition() {
		return this.groupCondition;
	}
	public void setGroupCondition(String groupCondition) {
		this.groupCondition = groupCondition;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getPrincipalTag() {
		return this.principalTag;
	}
	public void setPrincipalTag(String principalTag) {
		this.principalTag = principalTag;
	}

	public String getSceneType() {
		return this.sceneType;
	}
	public void setSceneType(String sceneType) {
		this.sceneType = sceneType;
	}

	public String getSellMode() {
		return this.sellMode;
	}
	public void setSellMode(String sellMode) {
		this.sellMode = sellMode;
	}

	public String getStartDate() {
		return this.startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

}
