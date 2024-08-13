package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 模板栏位信息
 *
 * @author auto create
 * @since 1.0, 2024-07-04 16:05:52
 */
public class TemplateColumnInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 4624422117353266495L;

	/**
	 * 标准栏位：行为由支付宝统一定，同时已经分配标准Code

BALANCE：会员卡余额

POINT：积分

LEVEL：等级

TELEPHONE：联系方式

自定义栏位：行为由商户定义，自定义Code码（只要无重复）
	 */
	@ApiField("code")
	private String code;

	/**
	 * 若template_style_info.column_info_layout
的值为grid，此项为宫格项所属分组标题。可空。如果需要展示该项，还需支付宝内部进行特殊配置。
	 */
	@ApiField("group_title")
	private String groupTitle;

	/**
	 * 当template_style_info.column_info_layout
的值为grid时，此参数必填。此项为宫格项的展示icon。通过接口（alipay.offline.material.image.upload）上传图片。
	 */
	@ApiField("icon_id")
	private String iconId;

	/**
	 * 扩展信息
	 */
	@ApiField("more_info")
	private MoreInfoDTO moreInfo;

	/**
	 * 1、openNative：打开二级页面，展现 more中descs

2、openWeb：打开URL

3、staticinfo：静态信息

注意：

不填则默认staticinfo；

标准code尽量使用staticinfo，例如TELEPHONE商家电话栏位就只支持staticinfo；
	 */
	@ApiField("operate_type")
	private String operateType;

	/**
	 * 只有当template_style_info.column_info_layout
的值为grid时，此参数有效。此项为宫格项标签，最多只会展示一个标签。
	 */
	@ApiField("tag")
	private String tag;

	/**
	 * 栏目标题
	 */
	@ApiField("title")
	private String title;

	/**
	 * 卡包详情页面，卡栏位右边展现的值



TELEPHONE栏位的商家联系电话号码由此value字段传入
	 */
	@ApiField("value")
	private String value;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getGroupTitle() {
		return this.groupTitle;
	}
	public void setGroupTitle(String groupTitle) {
		this.groupTitle = groupTitle;
	}

	public String getIconId() {
		return this.iconId;
	}
	public void setIconId(String iconId) {
		this.iconId = iconId;
	}

	public MoreInfoDTO getMoreInfo() {
		return this.moreInfo;
	}
	public void setMoreInfo(MoreInfoDTO moreInfo) {
		this.moreInfo = moreInfo;
	}

	public String getOperateType() {
		return this.operateType;
	}
	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}

	public String getTag() {
		return this.tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
