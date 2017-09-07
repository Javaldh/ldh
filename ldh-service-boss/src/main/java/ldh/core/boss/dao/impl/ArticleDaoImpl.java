package ldh.core.boss.dao.impl; 

import org.springframework.stereotype.Repository;

import ldh.common.core.dao.BaseDaoImpl;
import ldh.core.boss.dao.ArticleDao;
import ldh.facade.boss.entity.Article;


/**
 *类描述：1:文章 2:招聘 3:常见问题 4:产品 管理 Dao接口实现类
 *@author: huangbin
 *@date： 日期：2013-12-3 时间：下午2:26:52
 *@version 1.0
 */
@Repository("articleDao")
public class ArticleDaoImpl extends BaseDaoImpl<Article> implements ArticleDao {

}
 