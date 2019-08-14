package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 自助售卖机场景信息，一级场景与二级场景对应关系如下：

level_1:level_2
SCHOOL(学校):001(幼儿园和早教机构)
SCHOOL(学校):002(小学)
SCHOOL(学校):003(初中)
SCHOOL(学校):004(高中&职业技术学院)
SCHOOL(学校):005(大学)
SCHOOL(学校):006(培训机构)
SCHOOL(学校):007(其他)
MALL(商业场所):001(商场)
MALL(商业场所):002(酒店)
MALL(商业场所):003(4S店)
MALL(商业场所):004(步行街)
MALL(商业场所):005(其他)
STATION(交通枢纽):001(机场)
STATION(交通枢纽):002(火车站)
STATION(交通枢纽):003(汽车站)
STATION(交通枢纽):004(地铁)
STATION(交通枢纽):005(其他)
FACTORY(工厂):001(工厂)
COMMUNITY(社区):001(社区)
OFFICE(办公楼):001(办公楼)
HOSPITAL(医院):001(医院)
GOVERNMENT(政府机构):001(政府机构)
SCENIC_SPOT(旅游景点):001(旅游景点)
OTHERS(其他):001(其他)
 *
 * @author auto create
 * @since 1.0, 2018-08-10 11:47:11
 */
public class SmartAutomatScene extends AlipayObject {

	private static final long serialVersionUID = 3822553397173384791L;

	/**
	 * 自助售货机一级场景，可取值如下：
SCHOOL
MALL
STATION
FACTORY
COMMUNITY
OFFICE
HOSPITAL
GOVERNMENT
SCENIC_SPOT
OTHERS
	 */
	@ApiField("level_1")
	private String level1;

	/**
	 * 自助售货机二级场景，可取值如下(不同的一级场景下，可取值不同，详见scene说明)：
001
002
003
004
005
006
007
	 */
	@ApiField("level_2")
	private String level2;

	public String getLevel1() {
		return this.level1;
	}
	public void setLevel1(String level1) {
		this.level1 = level1;
	}

	public String getLevel2() {
		return this.level2;
	}
	public void setLevel2(String level2) {
		this.level2 = level2;
	}

}
