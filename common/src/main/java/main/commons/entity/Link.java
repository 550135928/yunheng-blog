package main.commons.entity;


import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import main.base.entity.SuperEntity;

/**
 * <p>
 * 友情链接表
 * </p>
 *
 * @author xuzhixiang
 * @since 22018年9月26日09:54:43
 */
@Data
@TableName("t_link")
public class Link extends SuperEntity<Link> {

    private static final long serialVersionUID = 1L;


    /**
     * 友链标题
     */
    private String title;

    /**
     * 友链介绍
     */
    private String summary;

    /**
     * 友链地址
     */
    private String url;

    /**
     * 友链状态： 0 申请中， 1：上线  2: 已下架
     */
    private Integer linkStatus;

    /**
     * 点击数
     */
    private Integer clickCount;

    /**
     * 排序字段
     */
    private Integer sort;

    /**
     * 管理员UID
     */
    private String adminUid;

    /**
     * 申请用户Uid
     */
    private String userUid;
}
