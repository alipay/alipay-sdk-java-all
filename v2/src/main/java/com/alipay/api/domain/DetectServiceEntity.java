package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 检测服务列表
 *
 * @author auto create
 * @since 1.0, 2020-02-22 12:31:40
 */
public class DetectServiceEntity extends AlipayObject {

	private static final long serialVersionUID = 4355392753679874681L;

	/**
	 * 业务唯一id，如迭代id等
	 */
	@ApiField("biz_uniq_id")
	private String bizUniqId;

	/**
	 * 该字段可选
	 */
	@ApiField("content")
	private String content;

	/**
	 * 固定为oblisk_detect_instant
	 */
	@ApiListField("detect_type_list")
	@ApiField("string")
	private List<String> detectTypeList;

	/**
	 * 扩展信息。JSON字符串。如果是小程序，则必须传version属性。必须
	 */
	@ApiField("extend_info")
	private String extendInfo;

	/**
	 * 该字段可选
	 */
	@ApiListField("pic_url_list")
	@ApiField("string")
	private List<String> picUrlList;

	/**
	 * 服务url。必须。
    1）如果是整个小程序的诊断(伙伴、云测都是此种情况),传appId|version，如.2019082366379626|2.5.33
  2）如果是某个小程序页面的诊断,传该页面的具体路径: alipays://platformapi/startapp?appId=2018091261350219&page=/pages/h5pages/h5pages
 3）如果是H5,传url, 如https://www.baidu.com
	 */
	@ApiField("service")
	private String service;

	/**
	 * 小程序名称，或者H5服务名称。必须。
	 */
	@ApiField("title")
	private String title;

	public String getBizUniqId() {
		return this.bizUniqId;
	}
	public void setBizUniqId(String bizUniqId) {
		this.bizUniqId = bizUniqId;
	}

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public List<String> getDetectTypeList() {
		return this.detectTypeList;
	}
	public void setDetectTypeList(List<String> detectTypeList) {
		this.detectTypeList = detectTypeList;
	}

	public String getExtendInfo() {
		return this.extendInfo;
	}
	public void setExtendInfo(String extendInfo) {
		this.extendInfo = extendInfo;
	}

	public List<String> getPicUrlList() {
		return this.picUrlList;
	}
	public void setPicUrlList(List<String> picUrlList) {
		this.picUrlList = picUrlList;
	}

	public String getService() {
		return this.service;
	}
	public void setService(String service) {
		this.service = service;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
