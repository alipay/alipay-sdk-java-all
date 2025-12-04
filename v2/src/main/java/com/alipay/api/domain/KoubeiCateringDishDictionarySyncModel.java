package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑菜品字典数据同步
 *
 * @author auto create
 * @since 1.0, 2022-01-04 10:32:45
 */
public class KoubeiCateringDishDictionarySyncModel extends AlipayObject {

	private static final long serialVersionUID = 5519235699866293968L;

	/**
	 * 业务字典类型. 定义如下: 
catetory 分类 ;
unit 单位;
spec 规格；
virtual_catetory 虚拟类目。
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 字典类
	 */
	@ApiField("kb_dish_dictionary")
	private KbdishDictionary kbDishDictionary;

	/**
	 * 同步类型: 
add 新增;
update 修改;
stateChange 状态变更;
del删除
（星巴克只支持新增和更新）
	 */
	@ApiField("syn_type")
	private String synType;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public KbdishDictionary getKbDishDictionary() {
		return this.kbDishDictionary;
	}
	public void setKbDishDictionary(KbdishDictionary kbDishDictionary) {
		this.kbDishDictionary = kbDishDictionary;
	}

	public String getSynType() {
		return this.synType;
	}
	public void setSynType(String synType) {
		this.synType = synType;
	}

}
