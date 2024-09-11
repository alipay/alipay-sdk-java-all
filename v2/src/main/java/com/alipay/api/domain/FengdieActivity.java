package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 凤蝶H5应用详情信息
 *
 * @author auto create
 * @since 1.0, 2017-03-20 10:29:11
 */
public class FengdieActivity extends AlipayObject {

	private static final long serialVersionUID = 1727734377786364868L;

	/**
	 * H5应用的唯一id，调用alipay.marketing.tool.fengdie.activity.create接口时自动生成
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 应用是否已在线，在H5编辑器中点击发布按钮或者过了有效期会修改状态。如：true：在线，在设置的有效期内 ；false：已下线，超过了设置的有效期范围
	 */
	@ApiField("is_online")
	private Boolean isOnline;

	/**
	 * 创建的H5应用的名称，调用alipay.marketing.tool.fengdie.activity.create接口时作为参数传入，默认自动生成。最终显示在H5生成的URL上。URL规则为 "域名/p/f/${name}/index.html"
	 */
	@ApiField("name")
	private String name;

	/**
	 * appid所属支付宝账号昵称
	 */
	@ApiField("nick_name")
	private String nickName;

	/**
	 * H5应用下线时间，在H5编辑器中修改
	 */
	@ApiField("offline_time")
	private Date offlineTime;

	/**
	 * 唤起H5编辑器时默认展示的表单数据
	 */
	@ApiListField("page")
	@ApiField("fengdie_activity_page")
	private List<FengdieActivityPage> page;

	/**
	 * H5应用最近一次发布时间，在H5编辑器中点击发布按钮时会修改
	 */
	@ApiField("publish_time")
	private Date publishTime;

	/**
	 * H5应用被编辑的状态，如：OPEN：编辑中；COMPLETE：已完成；PRERELEASED：预览页面生成成功；PRERELEASE_FAIL：预览页面生成失败；RELEASED：已发布；RELEASE_FAIL：发布失败。在H5编辑器中点击保存、编辑完成、发布按钮时会触发。
	 */
	@ApiField("status")
	private String status;

	/**
	 * 创建H5应用所使用的模板包唯一id
	 */
	@ApiField("template_id")
	private Long templateId;

	/**
	 * H5应用的标题，在唤起的H5编辑器中输入
	 */
	@ApiField("title")
	private String title;

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public Boolean getIsOnline() {
		return this.isOnline;
	}
	public void setIsOnline(Boolean isOnline) {
		this.isOnline = isOnline;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getNickName() {
		return this.nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public Date getOfflineTime() {
		return this.offlineTime;
	}
	public void setOfflineTime(Date offlineTime) {
		this.offlineTime = offlineTime;
	}

	public List<FengdieActivityPage> getPage() {
		return this.page;
	}
	public void setPage(List<FengdieActivityPage> page) {
		this.page = page;
	}

	public Date getPublishTime() {
		return this.publishTime;
	}
	public void setPublishTime(Date publishTime) {
		this.publishTime = publishTime;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public Long getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(Long templateId) {
		this.templateId = templateId;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
