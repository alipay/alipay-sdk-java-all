package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑视图规则模型
 *
 * @author auto create
 * @since 1.0, 2020-09-07 16:15:31
 */
public class KbdishCommRuleShowInfo extends AlipayObject {

	private static final long serialVersionUID = 7327399592844843367L;

	/**
	 * 规则扩展
	 */
	@ApiField("tag_ext_info")
	private String tagExtInfo;

	/**
	 * 键值如下：
组维度的规则：
minLimit：组最小选择份数
maxLimit：组最大选择份数
required：是否必选
selectNum：可选选项数量，默认不限制
fold：是否折叠到进阶选择里
change: 是否可以置换
明细维度的规则：
minLimit：明细最小选择份数
maxLimit：明细最大选择份数
addPrice：加价
addPriceStep：加价步长，默认为1
defaultNum：默认份数
default：是否默认
required：是否必选

规格组维度的规则：
default:  是否默认
规则标签明细的规则:
default:  是否默认
sort: 排序值
hidden:是否隐藏
	 */
	@ApiField("tag_name")
	private String tagName;

	/**
	 * 规则值 数字 或者是否 , 数字 或者true/false
	 */
	@ApiField("tag_value")
	private String tagValue;

	public String getTagExtInfo() {
		return this.tagExtInfo;
	}
	public void setTagExtInfo(String tagExtInfo) {
		this.tagExtInfo = tagExtInfo;
	}

	public String getTagName() {
		return this.tagName;
	}
	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

	public String getTagValue() {
		return this.tagValue;
	}
	public void setTagValue(String tagValue) {
		this.tagValue = tagValue;
	}

}
