package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 搜索运营列表的查询request
 *
 * @author auto create
 * @since 1.0, 2021-09-17 18:03:13
 */
public class SearchOperPageQueryRequest extends AlipayObject {

	private static final long serialVersionUID = 3345792874529246162L;

	/**
	 * 申请类型 BASE：基础信息， BRAND_BOX：品牌直达，SERVICE_BOX服务直达
	 */
	@ApiField("access_type")
	private String accessType;

	/**
	 * 小程序ID
	 */
	@ApiField("appid")
	private String appid;

	/**
	 * 当前页
	 */
	@ApiField("page_num")
	private String pageNum;

	/**
	 * 每页显示条数
	 */
	@ApiField("page_size")
	private String pageSize;

	/**
	 * 场景码
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 服务类型 SP_MINI_APP 小程序 SP_PUBLIC_APP 生活号
	 */
	@ApiField("spec_code")
	private String specCode;

	public String getAccessType() {
		return this.accessType;
	}
	public void setAccessType(String accessType) {
		this.accessType = accessType;
	}

	public String getAppid() {
		return this.appid;
	}
	public void setAppid(String appid) {
		this.appid = appid;
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

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getSpecCode() {
		return this.specCode;
	}
	public void setSpecCode(String specCode) {
		this.specCode = specCode;
	}

}
