package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 子菜单对象模型
 *
 * @author auto create
 * @since 1.0, 2017-10-31 19:50:53
 */
public class SubButton extends AlipayObject {

	private static final long serialVersionUID = 1215595996511131912L;

	/**
	 * 当actionType为link时，该参数为url链接； 
当actionType为out时，该参数为用户自定义参数； 
当actionType为tel时，该参数为电话号码。 
当action_type为map时，该参数为查看地图的关键字。
 当action_type为consumption时，该参数可不传。 
该参数最长255个字符，不允许冒号等特殊字符。
	 */
	@ApiField("action_param")
	private String actionParam;

	/**
	 * 菜单类型：
out——事件型菜单；
link——链接型菜单；
tel——点击拨打电话；
map——点击查看地图；
consumption——点击查看用户与生活号管理员账号之间的消费记录
	 */
	@ApiField("action_type")
	private String actionType;

	/**
	 * icon图片url，必须是http协议的url，尺寸为60X60，最大不超过5M，请先调用<a href="https://docs.open.alipay.com/api_3/alipay.offline.material.image.upload"> 图片上传接口</a>获得图片url
	 */
	@ApiField("icon")
	private String icon;

	/**
	 * 菜单名称，icon菜单名称不超过5个汉字，文本菜单名称不超过9个汉字，编码格式为GBK
	 */
	@ApiField("name")
	private String name;

	public String getActionParam() {
		return this.actionParam;
	}
	public void setActionParam(String actionParam) {
		this.actionParam = actionParam;
	}

	public String getActionType() {
		return this.actionType;
	}
	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	public String getIcon() {
		return this.icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
