#include "DistanceTwoPoints.h"
/**
* @brief Class finds distance between two points.
* Typedefs make this slower however I wanted to mess about with them.
*
* @param points Vector of Vector that contains points to check.
* @param queries Vector of Vector that contains circles to check.
* @return Vector of number of points within area of queries.
*/
vector<int> DistanceTwoPoints::countPoints(vector< vector<int> > &points, vector< vector<int> > &queries) {
    vector<int> returnValues(queries.size(), 0);
    int32_t numPointsChecked = 0;
    for (auto &query : queries) {
        for (auto &point : points) {
            auto distanceBetweenPoints = GetDistance(point, query);
            if (distanceBetweenPoints <= query[radius]) returnValues[numPointsChecked]++;
        }
        numPointsChecked++;
    }
    return returnValues;
}

float DistanceTwoPoints::GetDistance(vector<int> &point, vector<int> &circle) {
    return sqrt(pow(point[XPosition] - circle[XPosition], 2.0) + pow(point[YPosition] - circle[YPosition], 2.0));
}