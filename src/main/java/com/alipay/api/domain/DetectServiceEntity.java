package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 检测项。如果是链接url，只需要赋值service字段；如果是纯文本，只需要赋值content；如果是图片，只需要赋值picUrlList。service、content、picUrlList不能同时赋值。
 *
 * @author auto create
 * @since 1.0, 2019-03-20 21:38:06
 */
public class DetectServiceEntity extends AlipayObject {

	private static final long serialVersionUID = 6181723598648197784L;

	/**
	 * 业务唯一id
	 */
	@ApiField("biz_uniq_id")
	private String bizUniqId;

	/**
	 * 待检测的文本类型
	 */
	@ApiField("content")
	private String content;

	/**
	 * 检测类型：content_diacrisis-内容检测，load_test-网页性能检测，vulnerabilities_scan-漏洞检测，res_Consumption资源流耗检测.
当content或者pic_url_list有值时，只能选择content_diacrisis;当service有值时，可以选择全部类型。
	 */
	@ApiListField("detect_type_list")
	@ApiField("string")
	private List<String> detectTypeList;

	/**
	 * 自定义扩展信息，JSON字符串。
如果detect_type_list包含res_Consumption资源流耗检测，则该字段可以填写流耗检测相关指标信息。(avgImgSize表示页面平均图片大小指标，单位KB；pageSize表示页面大小指标，单位KB；resCheckRela表示上面两个指标逻辑关系，取值or表示或，取值and表示且)
	 */
	@ApiField("extend_info")
	private String extendInfo;

	/**
	 * 图片url列表
	 */
	@ApiListField("pic_url_list")
	@ApiField("string")
	private List<String> picUrlList;

	/**
	 * 待检测的链接，必须是有效的url
	 */
	@ApiField("service")
	private String service;

	/**
	 * 描述service,content,pic_url_list的名称信息，方便定位问题
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
