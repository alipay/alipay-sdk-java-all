package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 栏目信息
 *
 * @author auto create
 * @since 1.0, 2018-11-29 17:43:46
 */
public class ViewColumnInfoModel extends AlipayObject {

	private static final long serialVersionUID = 5692386839166489444L;

	/**
	 * LEVEL：等级 
TELEPHONE：联系方式 
自定义栏位：行为由商户定义，自定义Code码（只要无重复）
	 */
	@ApiField("code")
	private String code;

	/**
	 * 扩展信息
	 */
	@ApiField("column_more_info")
	private ColumnMoreInfoModel columnMoreInfo;

	/**
	 * 1、openNative：打开二级页面，展现 more中descs 。column_more_info不能为空，且column_more_info的descs不能为空。
2、openWeb：打开URL 。column_more_info不能为空，且column_more_info的url不能为空。
3、staticinfo：静态信息 。不能设置column_more_info
注意： 
不填则默认staticinfo； 
标准code尽量使用staticinfo，例如TELEPHONE商家电话栏位就只支持staticinfo；
	 */
	@ApiField("operate_type")
	private String operateType;

	/**
	 * 栏目的标题
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

	public ColumnMoreInfoModel getColumnMoreInfo() {
		return this.columnMoreInfo;
	}
	public void setColumnMoreInfo(ColumnMoreInfoModel columnMoreInfo) {
		this.columnMoreInfo = columnMoreInfo;
	}

	public String getOperateType() {
		return this.operateType;
	}
	public void setOperateType(String operateType) {
		this.operateType = operateType;
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
