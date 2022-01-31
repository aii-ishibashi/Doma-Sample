select
 *
from
 pages p
 inner join units u on p.unit_id = u.id
where
 u.id = /* unitId */1
 and p.id = /* pageId */1
;
