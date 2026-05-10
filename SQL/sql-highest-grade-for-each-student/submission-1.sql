WITH ranked AS (
    SELECT 
    student_id,
    exam_id,
    score,
    RANK() OVER(PARTITION BY student_id ORDER BY score DESC,exam_id ASC) as rnk
FROM exam_results
)

SELECT 
    student_id,
    exam_id,
    score
FROM ranked 
WHERE rnk = 1